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
    public static final k0 f45668e;
    public static final List f45669f;
    public static final List f45670g;
    public static ArrayList h;
    public static boolean f45671i;
    public final String f45672a;
    public final String f45673b;
    public final String f45674c;
    public final b5 d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new b5(new a80(27)));
        f45668e = k0Var;
        f45669f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new b5(new a80(28))), new k0("serif", "PhotoEditorTypefaceSerif", new b5(new a80(29))), new k0("condensed", "PhotoEditorTypefaceCondensed", new b5(new e0(0))), new k0("mono", "PhotoEditorTypefaceMono", new b5(new e0(1))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new b5(new e0(2))));
        f45670g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, b5 b5Var) {
        this.f45672a = str;
        this.f45673b = str2;
        this.f45674c = null;
        this.d = b5Var;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f45671i) {
                f45671i = true;
                Utilities.themeQueue.postRunnable(new t21(12));
            }
            return f45669f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f45665c];
        randomAccessFile.read(bArr);
        if (j0Var.f45663a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        b5 b5Var = this.d;
        if (((Typeface) b5Var.f20462c) == null) {
            b5Var.f20462c = ((i0) b5Var.f20461b).a();
        }
        return (Typeface) b5Var.f20462c;
    }

    public k0(Font font, String str) {
        this.f45672a = str;
        this.f45674c = str;
        this.f45673b = null;
        this.d = new b5(new m4.w(font, 17));
    }
}
