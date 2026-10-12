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
import org.telegram.ui.c80;
import org.telegram.ui.w21;
public final class k0 {
    public static final k0 f45556e;
    public static final List f45557f;
    public static final List f45558g;
    public static ArrayList h;
    public static boolean f45559i;
    public final String f45560a;
    public final String f45561b;
    public final String f45562c;
    public final n7.z0 d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new n7.z0(new c80(27)));
        f45556e = k0Var;
        f45557f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new n7.z0(new c80(28))), new k0("serif", "PhotoEditorTypefaceSerif", new n7.z0(new c80(29))), new k0("condensed", "PhotoEditorTypefaceCondensed", new n7.z0(new e0(0))), new k0("mono", "PhotoEditorTypefaceMono", new n7.z0(new e0(1))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new n7.z0(new e0(2))));
        f45558g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, n7.z0 z0Var) {
        this.f45560a = str;
        this.f45561b = str2;
        this.f45562c = null;
        this.d = z0Var;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f45559i) {
                f45559i = true;
                Utilities.themeQueue.postRunnable(new w21(12));
            }
            return f45557f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f45552c];
        randomAccessFile.read(bArr);
        if (j0Var.f45550a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n7.z0 z0Var = this.d;
        if (((Typeface) z0Var.f16573c) == null) {
            z0Var.f16573c = ((i0) z0Var.f16572b).a();
        }
        return (Typeface) z0Var.f16573c;
    }

    public k0(Font font, String str) {
        this.f45560a = str;
        this.f45562c = str;
        this.f45561b = null;
        this.d = new n7.z0(new m4.x(font, 17));
    }
}
