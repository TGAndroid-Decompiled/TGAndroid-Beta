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
import org.telegram.ui.n21;
public final class k0 {
    public static final k0 f44517e;
    public static final List f44518f;
    public static final List f44519g;
    public static ArrayList h;
    public static boolean f44520i;
    public final String f44521a;
    public final String f44522b;
    public final String f44523c;
    public final o0.a d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new o0.a(new org.telegram.ui.web.w(5)));
        f44517e = k0Var;
        f44518f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new o0.a(new org.telegram.ui.web.w(6))), new k0("serif", "PhotoEditorTypefaceSerif", new o0.a(new org.telegram.ui.web.w(7))), new k0("condensed", "PhotoEditorTypefaceCondensed", new o0.a(new org.telegram.ui.web.w(8))), new k0("mono", "PhotoEditorTypefaceMono", new o0.a(new org.telegram.ui.web.w(9))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new o0.a(new org.telegram.ui.web.w(10))));
        f44519g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, o0.a aVar) {
        this.f44521a = str;
        this.f44522b = str2;
        this.f44523c = null;
        this.d = aVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.k0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f44520i) {
                f44520i = true;
                Utilities.themeQueue.postRunnable(new n21(10));
            }
            return f44518f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f44514c];
        randomAccessFile.read(bArr);
        if (j0Var.f44512a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        o0.a aVar = this.d;
        if (((Typeface) aVar.f16933c) == null) {
            aVar.f16933c = ((i0) aVar.f16932b).a();
        }
        return (Typeface) aVar.f16933c;
    }

    public k0(Font font, String str) {
        this.f44521a = str;
        this.f44523c = str;
        this.f44522b = null;
        this.d = new o0.a(new k2.v(font, 18));
    }
}
