package xf;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.lj0;
public final class i0 {
    public static final i0 f49236e;
    public static final List f49237f;
    public static final List f49238g;
    public static ArrayList h;
    public static boolean f49239i;
    public final String f49240a;
    public final String f49241b;
    public final String f49242c;
    public final w4.e d;

    static {
        i0 i0Var = new i0("roboto", "PhotoEditorTypefaceRoboto", new w4.e((g0) new v0.l(4)));
        f49236e = i0Var;
        f49237f = Arrays.asList(i0Var, new i0("italic", "PhotoEditorTypefaceItalic", new w4.e((g0) new v0.l(5))), new i0("serif", "PhotoEditorTypefaceSerif", new w4.e((g0) new v0.l(6))), new i0("condensed", "PhotoEditorTypefaceCondensed", new w4.e((g0) new v0.l(7))), new i0("mono", "PhotoEditorTypefaceMono", new w4.e((g0) new v0.l(8))), new i0("mw_bold", "PhotoEditorTypefaceMerriweather", new w4.e((g0) new v0.l(9))));
        f49238g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public i0(String str, String str2, w4.e eVar) {
        this.f49240a = str;
        this.f49241b = str2;
        this.f49242c = null;
        this.d = eVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: xf.i0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f49239i) {
                f49239i = true;
                Utilities.themeQueue.postRunnable(new lj0(16));
            }
            return f49237f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i9, h0 h0Var) {
        Charset charset;
        if (h0Var == null) {
            return null;
        }
        randomAccessFile.seek(i9 + h0Var.d);
        byte[] bArr = new byte[h0Var.f49233c];
        randomAccessFile.read(bArr);
        if (h0Var.f49231a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        w4.e eVar = this.d;
        if (((Typeface) eVar.f48762c) == null) {
            eVar.f48762c = ((g0) eVar.f48761b).a();
        }
        return (Typeface) eVar.f48762c;
    }

    public i0(Font font, String str) {
        this.f49240a = str;
        this.f49242c = str;
        this.f49241b = null;
        this.d = new w4.e((g0) new t0.c(font, 5));
    }
}
