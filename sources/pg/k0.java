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
import org.telegram.ui.g91;
import org.telegram.ui.rs;
public final class k0 {
    public static final k0 e;
    public static final List f40838f;
    public static final List f40839g;
    public static ArrayList h;
    public static boolean f40840i;
    public final String f40841a;
    public final String f40842b;
    public final String f40843c;
    public final o0.a d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new o0.a(new rs(27)));
        e = k0Var;
        f40838f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new o0.a(new rs(28))), new k0("serif", "PhotoEditorTypefaceSerif", new o0.a(new rs(29))), new k0("condensed", "PhotoEditorTypefaceCondensed", new o0.a(new e0(0))), new k0("mono", "PhotoEditorTypefaceMono", new o0.a(new e0(1))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new o0.a(new e0(2))));
        f40839g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, o0.a aVar) {
        this.f40841a = str;
        this.f40842b = str2;
        this.f40843c = null;
        this.d = aVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f40840i) {
                f40840i = true;
                Utilities.themeQueue.postRunnable(new g91(8));
            }
            return f40838f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f40834c];
        randomAccessFile.read(bArr);
        if (j0Var.f40832a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        o0.a aVar = this.d;
        if (((Typeface) aVar.f15276c) == null) {
            aVar.f15276c = ((i0) aVar.f15275b).a();
        }
        return (Typeface) aVar.f15276c;
    }

    public k0(Font font, String str) {
        this.f40841a = str;
        this.f40843c = str;
        this.f40842b = null;
        this.d = new o0.a(new le.b(font, 17));
    }
}
