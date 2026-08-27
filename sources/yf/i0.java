package yf;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.tq0;

public final class i0 {

    public static final i0 f49944e;

    public static final List f49945f;

    public static final List f49946g;
    public static ArrayList h;

    public static boolean f49947i;

    public final String f49948a;

    public final String f49949b;

    public final String f49950c;
    public final w3.b0 d;

    static {
        i0 i0Var = new i0("roboto", "PhotoEditorTypefaceRoboto", new w3.b0((g0) new u3.k(9)));
        f49944e = i0Var;
        f49945f = Arrays.asList(i0Var, new i0("italic", "PhotoEditorTypefaceItalic", new w3.b0((g0) new u3.k(10))), new i0("serif", "PhotoEditorTypefaceSerif", new w3.b0((g0) new u3.k(11))), new i0("condensed", "PhotoEditorTypefaceCondensed", new w3.b0((g0) new u3.k(12))), new i0("mono", "PhotoEditorTypefaceMono", new w3.b0((g0) new u3.k(13))), new i0("mw_bold", "PhotoEditorTypefaceMerriweather", new w3.b0((g0) new u3.k(14))));
        f49946g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public i0(String str, String str2, w3.b0 b0Var) {
        this.f49948a = str;
        this.f49949b = str2;
        this.f49950c = null;
        this.d = b0Var;
    }

    public static void b() throws Throwable {
        f0 f0Var;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList(f49945f);
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator<Font> it = SystemFonts.getAvailableFonts().iterator();
            HashMap map = new HashMap();
            while (true) {
                f0 f0Var2 = null;
                f0Var2 = null;
                f0Var2 = null;
                f0Var2 = null;
                RandomAccessFile randomAccessFile2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Font next = it.next();
                if (!next.getFile().getName().contains("Noto")) {
                    File file = next.getFile();
                    if (file != null) {
                        try {
                            randomAccessFile = new RandomAccessFile(file, "r");
                            try {
                                try {
                                    int i10 = randomAccessFile.readInt();
                                    if (i10 == 65536 || i10 == 1330926671) {
                                        int unsignedShort = randomAccessFile.readUnsignedShort();
                                        randomAccessFile.skipBytes(6);
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < unsignedShort) {
                                                int i12 = randomAccessFile.readInt();
                                                randomAccessFile.skipBytes(4);
                                                int i13 = randomAccessFile.readInt();
                                                randomAccessFile.readInt();
                                                if (i12 == 1851878757) {
                                                    randomAccessFile.seek(i13 + 2);
                                                    int unsignedShort2 = randomAccessFile.readUnsignedShort();
                                                    int unsignedShort3 = randomAccessFile.readUnsignedShort();
                                                    HashMap map2 = new HashMap();
                                                    for (int i14 = 0; i14 < unsignedShort2; i14++) {
                                                        h0 h0Var = new h0(randomAccessFile);
                                                        map2.put(Integer.valueOf(h0Var.f49939b), h0Var);
                                                    }
                                                    f0 f0Var3 = new f0();
                                                    f0Var3.f49931a = next;
                                                    int i15 = i13 + unsignedShort3;
                                                    f0Var3.f49932b = e(randomAccessFile, i15, (h0) map2.get(1));
                                                    f0Var3.f49933c = e(randomAccessFile, i15, (h0) map2.get(2));
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Exception unused) {
                                                    }
                                                    f0Var2 = f0Var3;
                                                } else {
                                                    i11++;
                                                }
                                            } else {
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Exception unused2) {
                                                }
                                            }
                                        }
                                    } else {
                                        randomAccessFile.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    randomAccessFile2 = randomAccessFile;
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                FileLog.e(e);
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            randomAccessFile = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if (f0Var2 != null) {
                        e0 e0Var = (e0) map.get(f0Var2.f49932b);
                        if (e0Var == null) {
                            e0Var = new e0();
                            e0Var.f49920a = new ArrayList();
                            map.put(f0Var2.f49932b, e0Var);
                        }
                        e0Var.f49920a.add(f0Var2);
                    }
                }
            }
            Iterator it2 = f49946g.iterator();
            while (it2.hasNext()) {
                e0 e0Var2 = (e0) map.get((String) it2.next());
                if (e0Var2 != null) {
                    ArrayList arrayList2 = e0Var2.f49920a;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            f0Var = null;
                            break;
                        } else {
                            if ("Bold".equalsIgnoreCase(((f0) arrayList2.get(i16)).f49933c)) {
                                f0Var = (f0) arrayList2.get(i16);
                                break;
                            }
                            i16++;
                        }
                    }
                    if (f0Var == null) {
                        int i17 = 0;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                f0Var = null;
                                break;
                            } else {
                                if ("Regular".equalsIgnoreCase(((f0) arrayList2.get(i17)).f49933c)) {
                                    f0Var = (f0) arrayList2.get(i17);
                                    break;
                                }
                                i17++;
                            }
                        }
                        if (f0Var == null && !arrayList2.isEmpty()) {
                            f0Var = (f0) arrayList2.get(0);
                        }
                    }
                    if (f0Var != null) {
                        arrayList.add(new i0(f0Var.f49931a, ("Regular".equals(f0Var.f49933c) || TextUtils.isEmpty(f0Var.f49933c)) ? f0Var.f49932b : f0Var.f49932b + " " + f0Var.f49933c));
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new gf.e(arrayList, 1));
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList != null) {
            return arrayList;
        }
        if (arrayList == null && !f49947i) {
            f49947i = true;
            Utilities.themeQueue.postRunnable(new tq0(17));
        }
        return f49945f;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, h0 h0Var) throws IOException {
        if (h0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + h0Var.d);
        byte[] bArr = new byte[h0Var.f49940c];
        randomAccessFile.read(bArr);
        return new String(bArr, h0Var.f49938a == 1 ? StandardCharsets.UTF_16BE : StandardCharsets.UTF_8);
    }

    public final Typeface d() {
        w3.b0 b0Var = this.d;
        if (((Typeface) b0Var.f48999c) == null) {
            b0Var.f48999c = ((g0) b0Var.f48998b).a();
        }
        return (Typeface) b0Var.f48999c;
    }

    public i0(Font font, String str) {
        this.f49948a = str;
        this.f49950c = str;
        this.f49949b = null;
        this.d = new w3.b0((g0) new t0.c(font, 6));
    }
}
