import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solution;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import util.StringPadding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by the two world leading experts in CP: asekulsk & dkotlovs.
 */
public class Choco {

    public static void main(String[] args) {
//        solveModule1();
        solveModule2();
    }

//    public static void solveModule() {
//
//        List<String> modules = Arrays.asList(
//                "GMI", "EPR", "LDS", "TENI", "TGI", // 0,1,2,3,4
//                "MIN", "OPR", "ADS", "THI", "REN", // 5,6,7,8,9
//                "DBA", "INS", "SWT", "MCI", "BSY", // 10, 11, 12, 13, 14
//                "IDB", "SPIN", "INP", "WM1", "WM2", // 15, 16, 17, 18, 19
//                "PPR", "SPIN", "WM3", "WM4", "WM5", // 20, 21, 22, 23, 24
//                "BAIN", "KBIN", "PXP"); //25, 26, 27
//
//        List<String> modules1 = Arrays.asList(
//                "GMI", "EPR", "LDS", "TENI", "TGI"); // 0,1,2,3,4
//        List<String> modules2 = Arrays.asList(
//                "MIN", "OPR", "ADS", "THI", "REN"); // 5,6,7,8,9
//        List<String> modules3 = Arrays.asList(
//                "DBA", "INS", "SWT", "MCI", "BSY"); // 10, 11, 12, 13, 14
//        List<String> modules4 = Arrays.asList(
//                "IDB", "SPIN", "INP", "WM1", "WM2"); // 15, 16, 17, 18, 19
//        List<String> modules5 = Arrays.asList(
//                "PPR", "SPIN", "WM3", "WM4", "WM5"); // 20, 21, 22, 23, 24
//        List<String> modules6 = Arrays.asList(
//                "BAIN", "KBIN", "PXP"); //25, 26, 27
//
//        int n = modules.size() - 3;
//
//        Model model = new Model(n + "-module problem");
//
//        BoolVar[] vars1 = new BoolVar[modules1.size()];
//        BoolVar[] vars2 = new BoolVar[modules2.size()];
//        BoolVar[] vars3 = new BoolVar[modules3.size()];
//        BoolVar[] vars4 = new BoolVar[modules4.size()];
//        BoolVar[] vars5 = new BoolVar[modules5.size()];
//        BoolVar[] vars6 = new BoolVar[modules6.size()];
//
//        init_this_shit(model, vars1, modules1);
//        init_this_shit(model, vars2, modules2);
//        init_this_shit(model, vars3, modules3);
//        init_this_shit(model, vars4, modules4);
//        init_this_shit(model, vars5, modules5);
//        //init_this_shit(model, vars6, modules6);
//
//        // GMI -> MIN
//        setup_dependency(model, vars1[0 % 5], vars2[5 % 5]);
//        // EPR -> OPR
//        setup_dependency(model, vars1[1 % 5], vars2[6 % 5]);
//        // EPR & LDS -> ADS
//        setup_dependency(model, vars1[1 % 5], vars2[7 % 5]);
//        setup_dependency(model, vars1[2 % 5], vars2[7 % 5]);
//        // EPR & LDS -> THI
//        setup_dependency(model, vars1[1 % 5], vars2[8 % 5]);
//        setup_dependency(model, vars1[2 % 5], vars2[8 % 5]);
//        // TGI -> BSY
//        setup_dependency(model, vars1[4 % 5], vars3[14 % 5]);
//        // OPR -> INS
//        setup_dependency(model, vars2[6 % 5], vars3[11 % 5]);
//        // GMI & OPR & ADS -> SWT
//        setup_dependency(model, vars1[1 % 5], vars3[12 % 5]);
//        setup_dependency(model, vars2[6 % 5], vars3[12 % 5]);
//        setup_dependency(model, vars2[7 % 5], vars3[12 % 5]);
//        // OPR -> DBA
//        setup_dependency(model, vars2[6 % 5], vars3[10 % 5]);
//        // OPR -> MCI
//        setup_dependency(model, vars2[6 % 5], vars3[13 % 5]);
//        // SWT & MCI -> SPIN
//        setup_dependency(model, vars3[12 % 5], vars4[16 % 5]);
//        setup_dependency(model, vars3[13 % 5], vars4[16 % 5]);
//        setup_dependency(model, vars3[12 % 5], vars5[21 % 5]);
//        setup_dependency(model, vars3[13 % 5], vars5[21 % 5]);
//        // DBA & INS -> IDB
//        setup_dependency(model, vars3[10 % 5], vars4[15 % 5]);
//        setup_dependency(model, vars3[11 % 5], vars4[15 % 5]);
//        // OPR & ADS -> PPR
//        setup_dependency(model, vars2[6 % 5], vars5[20 % 5]);
//        setup_dependency(model, vars2[7 % 5], vars5[20 % 5]);
//
//        String result = "";
//        Solution solution = model.getSolver().findSolution();
//        if(solution != null) {
//            // Remove all TMP's from solution
//            String[] resultArray = solution.toString().split(",");
//            for (int i = 0; i < resultArray.length; i++) {
//                if (!resultArray[i].contains("TMP")) {
//                    result += resultArray[i];
//                }
//            }
//            System.out.println(result.trim());
//        }
//
//        List<Solution> solutions = model.getSolver().findAllSolutions();
//        if(solutions != null) {
//            int no = 0;
//            for(Solution sol : solutions) {
//                no++;
//                // Remove all TMP's from solution
//                result = "";
//                String[] resultArray = sol.toString().split(",");
//                for (int i = 0; i < resultArray.length; i++) {
//                    if (!resultArray[i].contains("TMP")) {
//                        result += resultArray[i];
//                    }
//                }
//                System.out.println(no + ". " + result.trim());
//            }
//            System.out.println("Found " + solutions.size() + " solutions.");
//        }
//
//    }

    private static void solveModule1() {

        // Maximum modules per semester.
        int modsPerSem = 3;

        // Maximum semesters over all
        int maxSems = 10;


        ////////////
        // MODEL: //
        ////////////

        // x-axis: number of modules per semester (curses per term)
        // y-axis: number of necessary terms over all
        //
        //         x0   x1   x2   x3   ...
        //    y0  0.GMI  1.EPR  2.LDS   -
        //    y1  3.MIN  4.TENI 5.TGI   -
        //    y2  6.OPR  7.ADS  8.THI   -
        //    y3  9...   10...  11...   -
        //    y4
        //    ...

        // Modules
        List<String> modules = Arrays.asList(
                "TGI", "TENI", "GMI", "EPR", "LDS", // 0, 1, 2, 3, 4
                "MIN", "REN", "OPR", "ADS", "THI", // 5, 6, 7, 8, 9
                "BSY", "INS", "SWT", "DBA", "MCI", // 10, 11, 12, 13, 14
                "SPIN1", "IDB", "INP", "WM1", "WM2", // 15, 16, 17, 18, 19
                "SPIN2", "PPR", "WM3", "WM4", "WM5", // 20, 21, 22, 23, 24
                "BAIN", "KBIN", "PXP"); //25, 26, 27

        // Selectable modules
//        List<String> selModules = Arrays.asList(
//                "BWIN", "BV", "ITS", "ITR", "KBE", "MRO", "OPC", // 0, 1, 2, 3, 4, 5, 6
//                "BKV", "KI", "MOC", "PAP", "ROB", "SWD"); // 7, 8, 9, 10, 11, 12

        // Amount of modules to be considered
        int n = modules.size();

        // CS-Model
        Model model = new Model("module problem");

        // Variables: modules
        IntVar[] modulVars = new IntVar[n];
        for (int i = 0; i < modulVars.length; i++) {
            modulVars[i] = model.intVar(modules.get(i), 0, (maxSems * modsPerSem) - 1);
        }

        // Variables: credit points
        IntVar cp = model.intVar("cp", 0, 180); // 150 + 12 + 3 + 15
        IntVar[] cpVars = new IntVar[n];
        cpVars[0] = model.intVar(modules.get(0), 5);    // TGI
        cpVars[1] = model.intVar(modules.get(1), 5);    // TENI
        cpVars[2] = model.intVar(modules.get(2), 7);    // GMI
        cpVars[3] = model.intVar(modules.get(3), 7);    // EPR
        cpVars[4] = model.intVar(modules.get(4), 6);    // LDS
        cpVars[5] = model.intVar(modules.get(5), 6);    // MIN
        cpVars[6] = model.intVar(modules.get(6), 5);    // REN
        cpVars[7] = model.intVar(modules.get(7), 7);    // OPR
        cpVars[8] = model.intVar(modules.get(8), 6);    // ADS
        cpVars[9] = model.intVar(modules.get(9), 6);    // THI
        cpVars[10] = model.intVar(modules.get(10), 6);  // BSY              | premise: 30cp
        cpVars[11] = model.intVar(modules.get(11), 6);  // INS              | premise: 30cp
        cpVars[12] = model.intVar(modules.get(12), 6);  // SWT              | premise: 30cp
        cpVars[13] = model.intVar(modules.get(13), 6);  // DBA              | premise: 30cp
        cpVars[14] = model.intVar(modules.get(14), 6);  // MCI              | premise: 30cp
        cpVars[15] = model.intVar(modules.get(15), 6);  // SPIN1 (6 of 12)  | premise: 50cp
        cpVars[16] = model.intVar(modules.get(16), 6);  // IDB              | premise: 50cp
        cpVars[17] = model.intVar(modules.get(17), 6);  // INP              | premise: 50cp
        cpVars[18] = model.intVar(modules.get(18), 6);  // WM1              | premise: 50cp
        cpVars[19] = model.intVar(modules.get(19), 6);  // WM2              | premise: 50cp
        cpVars[20] = model.intVar(modules.get(20), 6);  // SPIN2 (6 of 12)  | premise: 50cp
        cpVars[21] = model.intVar(modules.get(21), 6);  // PPR              | premise: 70cp
        cpVars[22] = model.intVar(modules.get(22), 6);  // WM3              | premise: 70cp
        cpVars[23] = model.intVar(modules.get(23), 6);  // WM4              | premise: 70cp
        cpVars[24] = model.intVar(modules.get(24), 6);  // WM5              | premise: 70cp
        cpVars[25] = model.intVar(modules.get(25), 12); // BAIN             | premise: 150cp
        cpVars[26] = model.intVar(modules.get(26), 3);  // KBIN             | premise: 150cp
        cpVars[27] = model.intVar(modules.get(27), 15); // PPX              | premise: 90cp

        // BWIN, WS, 6CP
        // BV, WS, 6CP (GMI, EPR, MIN, OPR, ADS, PPR)
        // ITS, WS, 6CP
        // ITR, WS, 6CP
        // KBE, WS, 6CP (SWT, DBA, MCI, IDB)
        // MRO, WS, 6CP (GMI, EPR, MIN, OPR, ADS, PPR)
        // OPC, WS, 6CP (EPR, OPR, PPR)

        // BKV, SS, 6CP (REN, BSY)
        // KI, SS, 6CP (EPR, LDS, OPR, ADS)
        // MOC, SS, 6CP (REN)
        // PAP, SS, 6CP (GMI, EPR, OPR, ADS, PPR)
        // ROB, SS, 6CP (GMI, EPR, MIN, OPR, ADS, PPR)
        // SWD, SS, 6CP (SWT, DBA, MCI, IDB)


        //////////////////
        // CONSTRAINTS: //
        //////////////////

        // Constraints: Alldiff
        model.allDifferent(modulVars).post();


        // Constraints: Module Dependencies
        // MIN: GMI
        setup_dependency2(model, modulVars[2], modulVars[5], modsPerSem);
        // OPR: EPR
        setup_dependency2(model, modulVars[3], modulVars[7], modsPerSem);
        // ADS: EPR, LDS
        setup_dependency2(model, modulVars[3], modulVars[8], modsPerSem);
        setup_dependency2(model, modulVars[4], modulVars[8], modsPerSem);
        // THI: EPR, LDS
        setup_dependency2(model, modulVars[3], modulVars[9], modsPerSem);
        setup_dependency2(model, modulVars[4], modulVars[9], modsPerSem);
        // BSY: TGI
        setup_dependency2(model, modulVars[0], modulVars[10], modsPerSem);
        // INS: EPR, OPR
        setup_dependency2(model, modulVars[3], modulVars[11], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[11], modsPerSem);
        // SWT: GMI, EPR, LDS, OPR, ADS
        setup_dependency2(model, modulVars[2], modulVars[12], modsPerSem);
        setup_dependency2(model, modulVars[3], modulVars[12], modsPerSem);
        setup_dependency2(model, modulVars[4], modulVars[12], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[12], modsPerSem);
        setup_dependency2(model, modulVars[8], modulVars[12], modsPerSem);
        // DBA: EPR, OPR
        setup_dependency2(model, modulVars[3], modulVars[13], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[13], modsPerSem);
        // MCI: EPR, OPR
        setup_dependency2(model, modulVars[3], modulVars[14], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[14], modsPerSem);
        // SPIN1: GMI, EPR, LDS, OPR, ADS, SWT, MCI
        setup_dependency2(model, modulVars[2], modulVars[15], modsPerSem);
        setup_dependency2(model, modulVars[3], modulVars[15], modsPerSem);
        setup_dependency2(model, modulVars[4], modulVars[15], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[15], modsPerSem);
        setup_dependency2(model, modulVars[8], modulVars[15], modsPerSem);
        setup_dependency2(model, modulVars[12], modulVars[15], modsPerSem);
        setup_dependency2(model, modulVars[14], modulVars[15], modsPerSem);
        // IDB: EPR, OPR, INS, DBA
        setup_dependency2(model, modulVars[3], modulVars[16], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[16], modsPerSem);
        setup_dependency2(model, modulVars[11], modulVars[16], modsPerSem);
        setup_dependency2(model, modulVars[13], modulVars[16], modsPerSem);
        // WM1
        model.arithm(modulVars[18], "<", modulVars[19]).post(); // WM1 < WM2
        model.arithm(modulVars[18], "<", modulVars[22]).post(); // WM1 < WM3
        model.arithm(modulVars[18], "<", modulVars[23]).post(); // WM1 < WM4
        model.arithm(modulVars[18], "<", modulVars[24]).post(); // WM1 < WM5
        // WM2
        model.arithm(modulVars[19], "<", modulVars[22]).post(); // WM2 < WM3
        model.arithm(modulVars[19], "<", modulVars[23]).post(); // WM2 < WM4
        model.arithm(modulVars[19], "<", modulVars[24]).post(); // WM2 < WM5
        // SPIN2: GMI, EPR, LDS, OPR, ADS, SWT, MCI, SPIN1
        setup_dependency2(model, modulVars[2], modulVars[20], modsPerSem);
        setup_dependency2(model, modulVars[3], modulVars[20], modsPerSem);
        setup_dependency2(model, modulVars[4], modulVars[20], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[20], modsPerSem);
        setup_dependency2(model, modulVars[8], modulVars[20], modsPerSem);
        setup_dependency2(model, modulVars[12], modulVars[20], modsPerSem);
        setup_dependency2(model, modulVars[14], modulVars[20], modsPerSem);
        setup_dependency2(model, modulVars[15], modulVars[20], modsPerSem);
        model.arithm(modulVars[20], "=", modulVars[15].add(3).intVar()).post(); // SPIN2 has to be right after SPIN1
        // PPR: EPR, LDS, OPR, ADS
        setup_dependency2(model, modulVars[3], modulVars[21], modsPerSem);
        setup_dependency2(model, modulVars[4], modulVars[21], modsPerSem);
        setup_dependency2(model, modulVars[7], modulVars[21], modsPerSem);
        setup_dependency2(model, modulVars[8], modulVars[21], modsPerSem);
        // WM3
        model.arithm(modulVars[22], "<", modulVars[23]).post(); // WM3 < WM4
        model.arithm(modulVars[22], "<", modulVars[24]).post(); // WM3 < WM5
        // WM4
        model.arithm(modulVars[23], "<", modulVars[24]).post(); // WM4 < WM5
        // BAIN: All modules, PPX
        for (int i = 0; i <= 24; i++) {
            setup_dependency2(model, modulVars[i], modulVars[25], modsPerSem);
        }
        IntVar rowB = modulVars[25].div(modsPerSem).intVar();
        IntVar rowK = modulVars[26].div(modsPerSem).intVar();
        IntVar rowP = modulVars[27].div(modsPerSem).intVar();
        model.arithm(rowB, ">=", rowP).post(); // BAIN.row >= PXX.row
        model.arithm(rowB, "=", rowK).post(); // BAIN.row = KBIN.row
        model.arithm(modulVars[25], "<", modulVars[26]).post(); // BAIN < KBIN
        // PPX: all modules from the first 3 semesters
        for (int i = 0; i <= 14; i++) {
            setup_dependency2(model, modulVars[i], modulVars[27], modsPerSem);
        }

//        model.arithm(modulVars[25], "=", 27).post(); // pseudo optimal solution (manually set boundary)


        // Constraints: WS cycle dependency (modules are only accessible during winter)
        setupCycleDependencyWS(model, modulVars[0], modsPerSem); // TGI
        setupCycleDependencyWS(model, modulVars[1], modsPerSem); // TENI
        setupCycleDependencyWS(model, modulVars[2], modsPerSem); // GMI
        setupCycleDependencyWS(model, modulVars[3], modsPerSem); // EPR
        setupCycleDependencyWS(model, modulVars[4], modsPerSem); // LDS
        setupCycleDependencyWS(model, modulVars[10], modsPerSem); // BSY
        setupCycleDependencyWS(model, modulVars[11], modsPerSem); // INS
        setupCycleDependencyWS(model, modulVars[12], modsPerSem); // SWT
        setupCycleDependencyWS(model, modulVars[13], modsPerSem); // DBA
        setupCycleDependencyWS(model, modulVars[14], modsPerSem); // MCI
        setupCycleDependencyWS(model, modulVars[20], modsPerSem); // SPIN2
        setupCycleDependencyWS(model, modulVars[21], modsPerSem); // PPR

        // Constraints: SS cycle dependency (modules are only accessible during summer)
        setupCycleDependencySS(model, modulVars[5], modsPerSem); // MIN
        setupCycleDependencySS(model, modulVars[6], modsPerSem); // REN
        setupCycleDependencySS(model, modulVars[7], modsPerSem); // OPR
        setupCycleDependencySS(model, modulVars[8], modsPerSem); // ADS
        setupCycleDependencySS(model, modulVars[9], modsPerSem); // THI
        setupCycleDependencySS(model, modulVars[15], modsPerSem); // SPIN1
        setupCycleDependencySS(model, modulVars[16], modsPerSem); // IDB
        setupCycleDependencySS(model, modulVars[17], modsPerSem); // INP
        setupCycleDependencySS(model, modulVars[27], modsPerSem); // PXP


        // Constraints: credit points premise for the 3. semester
//        IntVar[] cpCounts = new IntVar[5];
//        for (int i = 10; i <= 14; i++) {  // "BSY", "INS", "SWT", "DBA", "MCI"
//            cpCounts[i - 10] = model.intVar(0);
//            BoolVar[] passedModules = new BoolVar[modulVars.length];
//            ArrayList list = new ArrayList();
//            for (int j = 0; j < modulVars.length; j++) {
//                passedModules[j] = model.arithm(modulVars[j], "<", modulVars[i]).reify();
//                cpCounts[i - 10] = model.arithm(cpVars[j]).post();
//                model.ifThen(
//                    model.arithm(modulVars[j], "<", modulVars[i]),
//                    list.add(cpVars[j]),
//                );
//                model.ifThen
//            }
//            mode.sum()
//        }

        // BSY
//        IntVar cps = model.intVar(0);
//        for (int i = 0; i < modulVars.length; i++) {
//            IntVar rowI = modulVars[i].div(modsPerSem).intVar();
//            IntVar rowM = modulVars[10].div(modsPerSem).intVar();
//            model.ifThen(
//                    model.arithm(rowI, "<", rowM),
//                    cps = model.intOffsetView(cps, 2)
//            );
//            BoolVar passed = model.arithm(rowI, "<", rowM).reify(); // modul_i.row < BSY.row
//        }

//        "TGI", "TENI", "GMI", "EPR", "LDS", // 0, 1, 2, 3, 4
//        "MIN", "REN", "OPR", "ADS", "THI", // 5, 6, 7, 8, 9
//        "BSY", "INS", "SWT", "DBA", "MCI", // 10, 11, 12, 13, 14    | premise: 30cp
//        "SPIN1", "IDB", "INP", "WM1", "WM2", // 15, 16, 17, 18, 19  | premise: 50cp
//        "SPIN2", "PPR", "WM3", "WM4", "WM5", // 20, 21, 22, 23, 24  | premise: 70cp (except SPIN2)
//        "BAIN", "KBIN", "PXP"); //25, 26, 27

//        BAIN | premise: 135cp/150cp
//        PPX | premise: 90cp


        //////////////
        // SOLVING: //
        //////////////

        Solution solution = model.getSolver().findSolution();
//        model.setObjective(Model.MINIMIZE, modulVars[25]);
//        Solution solution = model.getSolver().findOptimalSolution(modulVars[25], Model.MINIMIZE);

        String[] output = new String[maxSems * modsPerSem];
        if (solution != null) {
//            // Remove unnecessary strings from solution
//            String result = "";
//            String[] resultArray = solution.toString().split(",");
//            for (String s : resultArray) {
//                if (!s.contains("TMP") && !s.contains("div_exp") && !s.contains("sum_exp") && !s.contains("mod_exp")) {
//                    result += s;
//                }
//            }
//            System.out.println(result.trim());

            // New output
            for (IntVar modulVar : modulVars) {
                output[solution.getIntVal(modulVar)] = modulVar.getName();
            }
            for (int i = 0; i < maxSems; i++) {
                String mods = "";
                int start = i * modsPerSem;
                for (int j = start; j < (start + modsPerSem); j++) {
                    String modulName = (output[j] == null) ? "" : output[j];
                    mods += StringPadding.rightPad(modulName, 5) + "   ";
                }
                System.out.println(StringPadding.leftPad("" + (i + 1), 2) + ". Sem:   " + mods);
            }
        } else {
            System.out.println("NO SOLUTION FOUND!");
        }

//        List<Solution> solutions = model.getSolver().findAllSolutions();
//        if(solutions != null) {
//            int no = 0;
//            for(Solution sol : solutions) {
//                no++;
//                // Remove unnecessary strings from solution
//                result = "";
//                String[] resultArray = sol.toString().split(",");
//                for (String s : resultArray) {
//                    if (!s.contains("TMP") && !s.contains("div_exp") && !s.contains("sum_exp") && !s.contains("mod_exp")) {
//                        result += s;
//                    }
//                }
//                System.out.println(no + ". " + result.trim());
//            }
//            System.out.println("Found " + solutions.size() + " solutions.");
//        }

    }

    private static void solveModule2() {

        // Maximum modules per semester.
        int modsPerSem = 3;

        // Maximum semesters over all
        int maxSems = 10;


        ////////////
        // MODEL: //
        ////////////

        // x-axis: number of modules per semester (curses per term)
        // y-axis: number of necessary terms over all
        //
        //         x0   x1   x2   x3   ...
        //    y0  0.GMI  1.EPR  2.LDS   -
        //    y1  3.MIN  4.TENI 5.TGI   -
        //    y2  6.OPR  7.ADS  8.THI   -
        //    y3  9...   10...  11...   -
        //    y4
        //    ...

        // Modules
        List<String> modules = Arrays.asList(
                "TGI", "TENI", "GMI", "EPR", "LDS", // 0, 1, 2, 3, 4
                "MIN", "REN", "OPR", "ADS", "THI", // 5, 6, 7, 8, 9
                "BSY", "INS", "SWT", "DBA", "MCI", // 10, 11, 12, 13, 14
                "SPIN1", "IDB", "INP", "WM1", "WM2", // 15, 16, 17, 18, 19
                "SPIN2", "PPR", "WM3", "WM4", "WM5", // 20, 21, 22, 23, 24
                "BAIN", "KBIN", "PXP"); //25, 26, 27

        // Selectable modules
//        List<String> selModules = Arrays.asList(
//                "BWIN", "BV", "ITS", "ITR", "KBE", "MRO", "OPC", // 0, 1, 2, 3, 4, 5, 6
//                "BKV", "KI", "MOC", "PAP", "ROB", "SWD"); // 7, 8, 9, 10, 11, 12

        // Amount of modules to be considered
        int n = modules.size();

        // CS-Model
        Model model = new Model("module problem");

        // Variables: modules
        IntVar[] modulVars = new IntVar[n];
        for (int i = 0; i < modulVars.length; i++) {
            //modulVars[i] = model.intVar(modules.get(i), 0, maxSems - 1);
            modulVars[i] = model.intVar(modules.get(i), new int[]{0,0,0,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9});
        }

        // Variables: credit points
        IntVar cp = model.intVar("cp", 0, 180); // 150 + 12 + 3 + 15
        IntVar[] cpVars = new IntVar[n];
        cpVars[0] = model.intVar(modules.get(0), 5);    // TGI
        cpVars[1] = model.intVar(modules.get(1), 5);    // TENI
        cpVars[2] = model.intVar(modules.get(2), 7);    // GMI
        cpVars[3] = model.intVar(modules.get(3), 7);    // EPR
        cpVars[4] = model.intVar(modules.get(4), 6);    // LDS
        cpVars[5] = model.intVar(modules.get(5), 6);    // MIN
        cpVars[6] = model.intVar(modules.get(6), 5);    // REN
        cpVars[7] = model.intVar(modules.get(7), 7);    // OPR
        cpVars[8] = model.intVar(modules.get(8), 6);    // ADS
        cpVars[9] = model.intVar(modules.get(9), 6);    // THI
        cpVars[10] = model.intVar(modules.get(10), 6);  // BSY              | premise: 30cp
        cpVars[11] = model.intVar(modules.get(11), 6);  // INS              | premise: 30cp
        cpVars[12] = model.intVar(modules.get(12), 6);  // SWT              | premise: 30cp
        cpVars[13] = model.intVar(modules.get(13), 6);  // DBA              | premise: 30cp
        cpVars[14] = model.intVar(modules.get(14), 6);  // MCI              | premise: 30cp
        cpVars[15] = model.intVar(modules.get(15), 6);  // SPIN1 (6 of 12)  | premise: 50cp
        cpVars[16] = model.intVar(modules.get(16), 6);  // IDB              | premise: 50cp
        cpVars[17] = model.intVar(modules.get(17), 6);  // INP              | premise: 50cp
        cpVars[18] = model.intVar(modules.get(18), 6);  // WM1              | premise: 50cp
        cpVars[19] = model.intVar(modules.get(19), 6);  // WM2              | premise: 50cp
        cpVars[20] = model.intVar(modules.get(20), 6);  // SPIN2 (6 of 12)  | premise: 50cp
        cpVars[21] = model.intVar(modules.get(21), 6);  // PPR              | premise: 70cp
        cpVars[22] = model.intVar(modules.get(22), 6);  // WM3              | premise: 70cp
        cpVars[23] = model.intVar(modules.get(23), 6);  // WM4              | premise: 70cp
        cpVars[24] = model.intVar(modules.get(24), 6);  // WM5              | premise: 70cp
        cpVars[25] = model.intVar(modules.get(25), 12); // BAIN             | premise: 150cp
        cpVars[26] = model.intVar(modules.get(26), 3);  // KBIN             | premise: 150cp
        cpVars[27] = model.intVar(modules.get(27), 15); // PPX              | premise: 90cp

        // BWIN, WS, 6CP
        // BV, WS, 6CP (GMI, EPR, MIN, OPR, ADS, PPR)
        // ITS, WS, 6CP
        // ITR, WS, 6CP
        // KBE, WS, 6CP (SWT, DBA, MCI, IDB)
        // MRO, WS, 6CP (GMI, EPR, MIN, OPR, ADS, PPR)
        // OPC, WS, 6CP (EPR, OPR, PPR)

        // BKV, SS, 6CP (REN, BSY)
        // KI, SS, 6CP (EPR, LDS, OPR, ADS)
        // MOC, SS, 6CP (REN)
        // PAP, SS, 6CP (GMI, EPR, OPR, ADS, PPR)
        // ROB, SS, 6CP (GMI, EPR, MIN, OPR, ADS, PPR)
        // SWD, SS, 6CP (SWT, DBA, MCI, IDB)


        //////////////////
        // CONSTRAINTS: //
        //////////////////

        // Constraints: maximum modules per semester
//        for (int i = 0; i < 8; i++) {
//            IntVar row = model.intVar(i);
//            Constraint[] consts = new Constraint[modsPerSem + 1];
//            for (int j = modsPerSem; j >= 0; j--) {
//                IntVar modsPerSemVar = model.intVar(j);
//                consts[j] = model.count(row, modulVars, modsPerSemVar);
//            }
//            model.or(consts).post();
//        }

//        model.atMostNValues(modulVars, modsPerSemVar, false).post();


        // Constraints: Module Dependencies
        // MIN: GMI
        model.arithm(modulVars[5], ">", modulVars[2]).post();
        // OPR: EPR
        model.arithm(modulVars[7], ">", modulVars[3]).post();
        // ADS: EPR, LDS
        model.arithm(modulVars[8], ">", modulVars[3]).post();
        model.arithm(modulVars[8], ">", modulVars[4]).post();
        // THI: EPR, LDS
        model.arithm(modulVars[9], ">", modulVars[3]).post();
        model.arithm(modulVars[9], ">", modulVars[4]).post();
        // BSY: TGI
        model.arithm(modulVars[10], ">", modulVars[0]).post();
        // INS: EPR, OPR
        model.arithm(modulVars[11], ">", modulVars[3]).post();
        model.arithm(modulVars[11], ">", modulVars[7]).post();
        // SWT: GMI, EPR, LDS, OPR, ADS
        model.arithm(modulVars[12], ">", modulVars[2]).post();
        model.arithm(modulVars[12], ">", modulVars[3]).post();
        model.arithm(modulVars[12], ">", modulVars[4]).post();
        model.arithm(modulVars[12], ">", modulVars[7]).post();
        model.arithm(modulVars[12], ">", modulVars[8]).post();
        // DBA: EPR, OPR
        model.arithm(modulVars[13], ">", modulVars[3]).post();
        model.arithm(modulVars[13], ">", modulVars[7]).post();
        // MCI: EPR, OPR
        model.arithm(modulVars[14], ">", modulVars[3]).post();
        model.arithm(modulVars[14], ">", modulVars[7]).post();
        // SPIN1: GMI, EPR, LDS, OPR, ADS, SWT, MCI
        model.arithm(modulVars[15], ">", modulVars[2]).post();
        model.arithm(modulVars[15], ">", modulVars[3]).post();
        model.arithm(modulVars[15], ">", modulVars[4]).post();
        model.arithm(modulVars[15], ">", modulVars[7]).post();
        model.arithm(modulVars[15], ">", modulVars[8]).post();
        model.arithm(modulVars[15], ">", modulVars[12]).post();
        model.arithm(modulVars[15], ">", modulVars[14]).post();
        // IDB: EPR, OPR, INS, DBA
        model.arithm(modulVars[16], ">", modulVars[3]).post();
        model.arithm(modulVars[16], ">", modulVars[7]).post();
        model.arithm(modulVars[16], ">", modulVars[11]).post();
        model.arithm(modulVars[16], ">", modulVars[13]).post();
        // SPIN2: GMI, EPR, LDS, OPR, ADS, SWT, MCI, SPIN1
        model.arithm(modulVars[20], ">", modulVars[2]).post();
        model.arithm(modulVars[20], ">", modulVars[3]).post();
        model.arithm(modulVars[20], ">", modulVars[4]).post();
        model.arithm(modulVars[20], ">", modulVars[7]).post();
        model.arithm(modulVars[20], ">", modulVars[8]).post();
        model.arithm(modulVars[20], ">", modulVars[12]).post();
        model.arithm(modulVars[20], ">", modulVars[14]).post();
        model.arithm(modulVars[20], ">", modulVars[15]).post();
        model.arithm(modulVars[20], "=", modulVars[15].add(1).intVar()).post(); // SPIN2 has to be right after SPIN1
        // PPR: EPR, LDS, OPR, ADS
        model.arithm(modulVars[21], ">", modulVars[3]).post();
        model.arithm(modulVars[21], ">", modulVars[4]).post();
        model.arithm(modulVars[21], ">", modulVars[7]).post();
        model.arithm(modulVars[21], ">", modulVars[8]).post();
        // BAIN: All modules, PPX
        for (int i = 0; i <= 24; i++) {
            model.arithm(modulVars[25], ">", modulVars[i]).post();
        }
        model.arithm(modulVars[25], ">=", modulVars[27]).post(); // BAIN.row >= PXX.row
        model.arithm(modulVars[25], "=", modulVars[26]).post(); // BAIN.row = KBIN.row
        // PPX: all modules from the first 3 semesters
        for (int i = 0; i <= 14; i++) {
            model.arithm(modulVars[27], ">", modulVars[i]).post();
        }

//        model.arithm(modulVars[25], "=", 27).post(); // pseudo optimal solution (manually set boundary)


        // Constraints: WS cycle dependency (modules are only accessible during winter)
        model.arithm(modulVars[0].mod(2).intVar(), "=", 0).post(); // TGI
        model.arithm(modulVars[1].mod(2).intVar(), "=", 0).post(); // TENI
        model.arithm(modulVars[2].mod(2).intVar(), "=", 0).post(); // GMI
        model.arithm(modulVars[3].mod(2).intVar(), "=", 0).post(); // EPR
        model.arithm(modulVars[4].mod(2).intVar(), "=", 0).post(); // LDS
        model.arithm(modulVars[10].mod(2).intVar(), "=", 0).post(); // BSY
        model.arithm(modulVars[11].mod(2).intVar(), "=", 0).post(); // INS
        model.arithm(modulVars[12].mod(2).intVar(), "=", 0).post(); // SWT
        model.arithm(modulVars[13].mod(2).intVar(), "=", 0).post(); // DBA
        model.arithm(modulVars[14].mod(2).intVar(), "=", 0).post(); // MCI
        model.arithm(modulVars[20].mod(2).intVar(), "=", 0).post(); // SPIN2
        model.arithm(modulVars[21].mod(2).intVar(), "=", 0).post(); // PPR

        // Constraints: SS cycle dependency (modules are only accessible during summer)
        model.arithm(modulVars[5].mod(2).intVar(), "=", 1).post(); // MIN
        model.arithm(modulVars[6].mod(2).intVar(), "=", 1).post(); // REN
        model.arithm(modulVars[7].mod(2).intVar(), "=", 1).post(); // OPR
        model.arithm(modulVars[8].mod(2).intVar(), "=", 1).post(); // ADS
        model.arithm(modulVars[9].mod(2).intVar(), "=", 1).post(); // THI
        model.arithm(modulVars[15].mod(2).intVar(), "=", 1).post(); // SPIN1
        model.arithm(modulVars[16].mod(2).intVar(), "=", 1).post(); // IDB
        model.arithm(modulVars[17].mod(2).intVar(), "=", 1).post(); // INP
        model.arithm(modulVars[27].mod(2).intVar(), "=", 1).post(); // PXP


        // Constraints: credit points premise for the 3. semester
//        IntVar[] cpCounts = new IntVar[5];
//        for (int i = 10; i <= 14; i++) {  // "BSY", "INS", "SWT", "DBA", "MCI"
//            cpCounts[i - 10] = model.intVar("cpCounts_" + i, 0);
//            BoolVar[] passedModules = new BoolVar[modulVars.length];
//            for (int j = 0; j < modulVars.length; j++) {
//                passedModules[j] = model.arithm(modulVars[j], "<", modulVars[i]).reify();
//                model.arithm(cpVars[j]).post();
//            }
//        }

//        "TGI", "TENI", "GMI", "EPR", "LDS", // 0, 1, 2, 3, 4
//        "MIN", "REN", "OPR", "ADS", "THI", // 5, 6, 7, 8, 9
//        "BSY", "INS", "SWT", "DBA", "MCI", // 10, 11, 12, 13, 14    | premise: 30cp
//        "SPIN1", "IDB", "INP", "WM1", "WM2", // 15, 16, 17, 18, 19  | premise: 50cp
//        "SPIN2", "PPR", "WM3", "WM4", "WM5", // 20, 21, 22, 23, 24  | premise: 70cp (except SPIN2)
//        "BAIN", "KBIN", "PXP"); //25, 26, 27

//        BAIN | premise: 135cp/150cp
//        PPX | premise: 90cp


        //////////////
        // SOLVING: //
        //////////////

        Solution solution = model.getSolver().findSolution();
//        model.setObjective(Model.MINIMIZE, modulVars[25]);
//        Solution solution = model.getSolver().findOptimalSolution(modulVars[25], Model.MINIMIZE);

        String[] output = new String[maxSems];
        if (solution != null) {
//            // Remove unnecessary strings from solution
//            String result = "";
//            String[] resultArray = solution.toString().split(",");
//            for (String s : resultArray) {
//                if (!s.contains("TMP") && !s.contains("div_exp") && !s.contains("sum_exp") && !s.contains("mod_exp")) {
//                    result += s;
//                }
//            }
//            System.out.println(result.trim());

            // New output
            for (IntVar modulVar : modulVars) {
                String rowString = output[solution.getIntVal(modulVar)];
                int row = solution.getIntVal(modulVar);
                if (output[row] != null) {
                    output[row] += modulVar.getName() + "   ";
                } else {
                    output[row] = modulVar.getName() + "   ";
                }
            }
            for (int i = 0; i < maxSems; i++) {
                if (output[i] != null) {
                    System.out.println(StringPadding.leftPad("" + (i + 1), 2) + ". Sem:   " + output[i]);
                } else {
                    System.out.println(StringPadding.leftPad("" + (i + 1), 2) + ". Sem:   ");
                }
            }
        } else {
            System.out.println("NO SOLUTION FOUND!");
        }

//        List<Solution> solutions = model.getSolver().findAllSolutions();
//        if(solutions != null) {
//            int no = 0;
//            for(Solution sol : solutions) {
//                no++;
//                // Remove unnecessary strings from solution
//                String result = "";
//                String[] resultArray = sol.toString().split(",");
//                for (String s : resultArray) {
//                    if (!s.contains("TMP") && !s.contains("div_exp") && !s.contains("sum_exp") && !s.contains("mod_exp")) {
//                        result += s;
//                    }
//                }
//                System.out.println(no + ". " + result.trim());
//            }
//            System.out.println("Found " + solutions.size() + " solutions.");
//        }

    }

    private static void setupCycleDependencyWS(Model model, IntVar a, int modsPerSem) {
        IntVar rowMod = a.div(modsPerSem).mod(2).intVar();
        model.arithm(rowMod, "=", 0).post(); // even
    }

    private static void setupCycleDependencySS(Model model, IntVar a, int modsPerSem) {
        IntVar rowMod = a.div(modsPerSem).mod(2).intVar();
        model.arithm(rowMod, "=", 1).post(); // odd
    }

    private static void setup_dependency2(Model model, IntVar a, IntVar b, int modsPerSem) {
        IntVar rowB = b.div(modsPerSem).intVar();
        model.arithm(rowB, ">", a.div(modsPerSem).intVar()).post();
    }

//    private static void setup_dependency(Model model, IntVar a, IntVar b) {
//        BoolVar c1 = model.arithm(a, "=", b).reify();
//        BoolVar c2 = model.arithm(a, ">", b).reify();
//        model.arithm(c1, "+", c2, "=", 1).post();
//    }
//
//    private static void init_this_shit(Model model, BoolVar[] vars, List<String> modules) {
//        for(int i = 0; i < vars.length; i++) {
//            vars[i] = model.boolVar(modules.get(i));
//        }
//    }

}