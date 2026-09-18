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
import org.telegram.ui.bs0;
import org.telegram.ui.p91;
public final class j0 {
    public static final j0 e;
    public static final List f40911f;
    public static final List f40912g;
    public static ArrayList h;
    public static boolean f40913i;
    public final String f40914a;
    public final String f40915b;
    public final String f40916c;
    public final o0.a d;

    static {
        j0 j0Var = new j0("roboto", "PhotoEditorTypefaceRoboto", new o0.a(new bs0(14)));
        e = j0Var;
        f40911f = Arrays.asList(j0Var, new j0("italic", "PhotoEditorTypefaceItalic", new o0.a(new bs0(15))), new j0("serif", "PhotoEditorTypefaceSerif", new o0.a(new bs0(16))), new j0("condensed", "PhotoEditorTypefaceCondensed", new o0.a(new bs0(17))), new j0("mono", "PhotoEditorTypefaceMono", new o0.a(new bs0(18))), new j0("mw_bold", "PhotoEditorTypefaceMerriweather", new o0.a(new bs0(19))));
        f40912g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public j0(String str, String str2, o0.a aVar) {
        this.f40914a = str;
        this.f40915b = str2;
        this.f40916c = null;
        this.d = aVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: pg.j0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f40913i) {
                f40913i = true;
                Utilities.themeQueue.postRunnable(new p91(8));
            }
            return f40911f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, i0 i0Var) {
        Charset charset;
        if (i0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + i0Var.d);
        byte[] bArr = new byte[i0Var.f40907c];
        randomAccessFile.read(bArr);
        if (i0Var.f40905a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        o0.a aVar = this.d;
        if (((Typeface) aVar.f15311c) == null) {
            aVar.f15311c = ((h0) aVar.f15310b).a();
        }
        return (Typeface) aVar.f15311c;
    }

    public j0(Font font, String str) {
        this.f40914a = str;
        this.f40916c = str;
        this.f40915b = null;
        this.d = new o0.a(new k2.v(font, 17));
    }
}
