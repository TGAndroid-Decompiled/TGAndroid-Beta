package zh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class a {
    public static String[] f51639a = {"Rosewood", "Carmine", "Fire Engine", "Seal Brown", "Chestnut", "Coral Red", "Strawberry", "Chocolate", "Mystic Pearl", "Burnt Sienna", "Tomato", "Cappuccino", "Copper", "Carrot Juice", "Persimmon", "Desert Sand", "Orange", "Caramel", "Old Gold", "Mustard", "Satin Gold", "Amber", "Pure Gold", "Light Olive", "Khaki Green", "Lemongrass", "Malachite", "Camo Green", "Pistachio", "Shamrock Green", "Dark Green", "Ranger Green", "Hunter Green", "Mint Green", "Emerald", "Pine Green", "Gunship Green", "Pacific Green", "Tactical Pine", "Jade Green", "Aquamarine", "Pacific Cyan", "Deep Cyan", "Turquoise", "Moonstone", "Sky Blue", "Azure Blue", "Gunmetal", "Celtic Blue", "Sapphire", "Silver Blue", "Indigo Dye", "French Blue", "Navy Blue", "Cobalt Blue", "Marine Blue", "Midnight Blue", "Neon Blue", "Cyberpunk", "Electric Indigo", "Lavender", "Grape", "French Violet", "English Violet", "Purple", "Electric Purple", "Dark Lilac", "Fandango", "Mexican Pink", "Burgundy", "Raspberry", "Black", "Onyx Black", "Rifle Green", "Battleship Grey", "Feldgrau", "Steel Grey", "Roman Silver", "Platinum", "Ivory White"};
    public static int[] f51640b = {-4752777, -2074806, -1024177, -10072763, -4296876, -2455189, -2257297, -6001064, -3110035, -2724036, -1672898, -5140354, -3111338, -2385817, -1595558, -5005438, -3040710, -3106510, -4879048, -2844659, -4220089, -2444475, -3364031, -4018332, -5394320, -5326758, -6966185, -9071539, -6836100, -7687837, -11443391, -10520503, -7360904, -8467582, -8862331, -9721476, -11171227, -9451629, -12287381, -11156324, -10440299, -10830170, -13519446, -10567496, -8474188, -10963768, -10636853, -11772573, -12207891, -10968120, -8346440, -11306607, -10708028, -9658659, -10450737, -11638628, -10720891, -9070855, -8024077, -5668621, -4748828, -6458175, -4038426, -5142853, -5346130, -3510074, -5145179, -1930570, -1874286, -6070682, -2065531, -13224136, -12170675, -10196644, -7566203, -7761272, -6839636, -6051659, -5067097, -4540751};
    public static int[] f51641c = {-8303534, -5752773, -3917495, -12110290, -6731720, -3906225, -4760992, -9157573, -5220496, -4895955, -2863553, -8625322, -6462159, -3707057, -3840161, -8490149, -4165817, -4754383, -7050971, -3901678, -7506119, -5144534, -6784206, -7831995, -9732780, -11168955, -12740779, -11242687, -10714804, -11168955, -13941457, -12824773, -11828645, -12214694, -12410511, -12682896, -12753321, -12870524, -13671575, -12871305, -12145740, -12741190, -15166055, -12742002, -10976368, -11301950, -12285013, -13681854, -13072679, -11306558, -10453871, -12491655, -13143142, -10719543, -11443528, -12891270, -13287337, -9936156, -7970861, -10788136, -7710020, -8827488, -7254311, -7906671, -8108156, -6921516, -7579782, -6006645, -3585668, -9617078, -4826752, -15855857, -14144466, -11840959, -9671578, -10589341, -10259844, -8617846, -7830402, -6185577};
    public static int[] d = {-11199454, -11599616, -9895927, -16120315, -10480376, -7794176, -5698548, -12711422, -6617818, -9762558, -8385792, -1321784, -10475263, -7462656, -5435904, -11516887, -6473465, -8571392, -11586814, -8772352, -10667264, -8769280, -9421824, -10925052, -13021157, -12162553, -16487674, -15321343, -14137573, -15570176, -16775935, -15719927, -14923489, -16618718, -16751310, -16037837, -16308707, -16752311, -16767452, -16496335, -16556185, -16620403, -16756913, -15641780, -15317678, -16293733, -16625548, -16513014, -16761211, -15907402, -15386805, -16573655, -16303268, -15582814, -15522692, -16709599, -16578024, -14145348, -12379994, -13163861, -10809173, -12711317, -11927158, -11263393, -12121017, -10350668, -10147758, -7469746, -9108944, -13368569, -7797192, -9672600, -16777216, -15789557, -13948384, -14932449, -13417134, -12630704, -12765139, -10068142};
    public static int[] e = {-1193267, -18515, -18522, -2835275, -80199, -9774, -11309, -1788244, -74272, -13136, -13123, -11914714, -730946, -10294, -6953, -858675, -7741, -9805, -8820, -8548, -72535, -4665, -6741, -660548, -2890053, -2559294, -4001858, -3151687, -2493751, -2753592, -4206167, -4733771, -2558498, -4325428, -4589095, -2558491, -4857644, -3735568, -4725037, -4260121, -3670530, -4788225, -3014659, -4327182, -2427395, -3282691, -4854529, -4799028, -4003841, -4071681, -3545868, -4006674, -4070407, -2891265, -4008971, -4469774, -4207392, -3154433, -2041345, -2565889, -1519105, -2048514, -1325057, -1652755, -799757, -1323265, -998174, -14357, -10522, -1590080, -10522, -7565423, -6381150, -3946563, -3158332, -2168351, -2104088, -2433054, -1447966, -658190};
    public static final String[] f51642f = {"Black", "Onyx Black", "Gunmetal", "Midnight Blue", "Steel Grey", "Roman Silver", "Raspberry", "Carmine", "Fire Engine", "Burnt Sienna", "Tomato", "Copper", "Persimmon", "Orange", "Caramel", "Mustard", "Old Gold", "Satin Gold", "Amber", "Pure Gold", "Lemongrass", "Malachite", "Shamrock Green", "Mint Green", "Emerald", "Pacific Green", "Jade Green", "Deep Cyan", "Celtic Blue", "Cobalt Blue", "Neon Blue", "Cyberpunk", "Electric Indigo", "Lavender", "Grape", "French Violet", "Purple", "Electric Purple", "Fandango", "Mexican Pink", "Burgundy", "Rosewood", "Chestnut", "Coral Red", "Strawberry", "Mystic Pearl", "Carrot Juice", "Light Olive", "Khaki Green", "Camo Green", "Pistachio", "Hunter Green", "Pine Green", "Gunship Green", "Tactical Pine", "Aquamarine", "Pacific Cyan", "Turquoise", "Moonstone", "Sky Blue", "Azure Blue", "Sapphire", "Silver Blue", "Indigo Dye", "French Blue", "Navy Blue", "English Violet", "Dark Lilac", "Seal Brown", "Chocolate", "Cappuccino", "Desert Sand", "Dark Green", "Ranger Green", "Marine Blue", "Ivory White", "Platinum", "Battleship Grey", "Rifle Green", "Feldgrau"};
    public static int[] f51643g;
    public static int[] h;

    public static boolean a(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = -1;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if ("Black".equals(((TLRPC.TL_shareThemeBackdropOption) arrayList.get(i11)).name)) {
                    i10 = i11;
                }
            }
            if (i10 >= 0) {
                int size = arrayList.size();
                f51639a = new String[size];
                f51640b = new int[size];
                f51641c = new int[size];
                d = new int[size];
                e = new int[size];
                h = new int[size];
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.TL_shareThemeBackdropOption tL_shareThemeBackdropOption = (TLRPC.TL_shareThemeBackdropOption) arrayList.get(i12);
                    f51639a[i12] = tL_shareThemeBackdropOption.name;
                    f51640b[i12] = tL_shareThemeBackdropOption.center_color | (-16777216);
                    f51641c[i12] = tL_shareThemeBackdropOption.edge_color | (-16777216);
                    d[i12] = tL_shareThemeBackdropOption.pattern_color | (-16777216);
                    e[i12] = tL_shareThemeBackdropOption.text_color | (-16777216);
                    h[i12] = tL_shareThemeBackdropOption.backdrop_id;
                }
                f51643g = null;
                int b10 = b("Neon Blue");
                c1.H9 = i10;
                c1.I9 = b10;
                c1.G9 = null;
                c1.F9 = null;
                c1.E9 = null;
                return true;
            }
        }
        return false;
    }

    public static int b(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f51639a;
            if (i10 < strArr.length) {
                if (str.equals(strArr[i10])) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }
}
