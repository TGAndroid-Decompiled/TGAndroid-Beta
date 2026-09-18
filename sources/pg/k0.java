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
import org.telegram.ui.o91;
import org.telegram.ui.wk0;
public final class k0 {
    public static final k0 e;
    public static final List f41142f;
    public static final List f41143g;
    public static ArrayList h;
    public static boolean f41144i;
    public final String f41145a;
    public final String f41146b;
    public final String f41147c;
    public final o0.a d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new o0.a(new wk0(16)));
        e = k0Var;
        f41142f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new o0.a(new wk0(17))), new k0("serif", "PhotoEditorTypefaceSerif", new o0.a(new wk0(18))), new k0("condensed", "PhotoEditorTypefaceCondensed", new o0.a(new wk0(19))), new k0("mono", "PhotoEditorTypefaceMono", new o0.a(new wk0(20))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new o0.a(new wk0(21))));
        f41143g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, o0.a aVar) {
        this.f41145a = str;
        this.f41146b = str2;
        this.f41147c = null;
        this.d = aVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f41144i) {
                f41144i = true;
                Utilities.themeQueue.postRunnable(new o91(8));
            }
            return f41142f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f41139c];
        randomAccessFile.read(bArr);
        if (j0Var.f41137a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        o0.a aVar = this.d;
        if (((Typeface) aVar.f15440c) == null) {
            aVar.f15440c = ((i0) aVar.f15439b).a();
        }
        return (Typeface) aVar.f15440c;
    }

    public k0(Font font, String str) {
        this.f41145a = str;
        this.f41147c = str;
        this.f41146b = null;
        this.d = new o0.a(new k2.v(font, 17));
    }
}
