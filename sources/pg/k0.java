package pg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.a80;
import org.telegram.ui.t21;
public final class k0 {
    public static final k0 f45714e;
    public static final List f45715f;
    public static final List f45716g;
    public static ArrayList h;
    public static boolean f45717i;
    public final String f45718a;
    public final String f45719b;
    public final String f45720c;
    public final b5 d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new b5(new a80(27)));
        f45714e = k0Var;
        f45715f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new b5(new a80(28))), new k0("serif", "PhotoEditorTypefaceSerif", new b5(new a80(29))), new k0("condensed", "PhotoEditorTypefaceCondensed", new b5(new e0(0))), new k0("mono", "PhotoEditorTypefaceMono", new b5(new e0(1))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new b5(new e0(2))));
        f45716g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, b5 b5Var) {
        this.f45718a = str;
        this.f45719b = str2;
        this.f45720c = null;
        this.d = b5Var;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f45717i) {
                f45717i = true;
                Utilities.themeQueue.postRunnable(new t21(12));
            }
            return f45715f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f45711c];
        randomAccessFile.read(bArr);
        if (j0Var.f45709a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        b5 b5Var = this.d;
        if (((Typeface) b5Var.f20466c) == null) {
            b5Var.f20466c = ((i0) b5Var.f20465b).a();
        }
        return (Typeface) b5Var.f20466c;
    }

    public k0(Font font, String str) {
        this.f45718a = str;
        this.f45720c = str;
        this.f45719b = null;
        this.d = new b5(new m4.w(font, 17));
    }
}
