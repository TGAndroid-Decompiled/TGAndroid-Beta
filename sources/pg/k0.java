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
import org.telegram.ui.s21;
import org.telegram.ui.v20;
public final class k0 {
    public static final k0 f45738e;
    public static final List f45739f;
    public static final List f45740g;
    public static ArrayList h;
    public static boolean f45741i;
    public final String f45742a;
    public final String f45743b;
    public final String f45744c;
    public final n7.z0 d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new n7.z0(new v20(29)));
        f45738e = k0Var;
        f45739f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new n7.z0(new e0(0))), new k0("serif", "PhotoEditorTypefaceSerif", new n7.z0(new e0(1))), new k0("condensed", "PhotoEditorTypefaceCondensed", new n7.z0(new e0(2))), new k0("mono", "PhotoEditorTypefaceMono", new n7.z0(new e0(3))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new n7.z0(new e0(4))));
        f45740g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, n7.z0 z0Var) {
        this.f45742a = str;
        this.f45743b = str2;
        this.f45744c = null;
        this.d = z0Var;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f45741i) {
                f45741i = true;
                Utilities.themeQueue.postRunnable(new s21(12));
            }
            return f45739f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f45735c];
        randomAccessFile.read(bArr);
        if (j0Var.f45733a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n7.z0 z0Var = this.d;
        if (((Typeface) z0Var.f16906c) == null) {
            z0Var.f16906c = ((i0) z0Var.f16905b).a();
        }
        return (Typeface) z0Var.f16906c;
    }

    public k0(Font font, String str) {
        this.f45742a = str;
        this.f45744c = str;
        this.f45743b = null;
        this.d = new n7.z0(new m4.w(font, 16));
    }
}
