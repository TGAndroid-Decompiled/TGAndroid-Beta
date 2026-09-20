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
import org.telegram.ui.ja0;
import org.telegram.ui.u21;
public final class k0 {
    public static final k0 e;
    public static final List f41183f;
    public static final List f41184g;
    public static ArrayList h;
    public static boolean f41185i;
    public final String f41186a;
    public final String f41187b;
    public final String f41188c;
    public final m5.e d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new m5.e((i0) new ja0(22)));
        e = k0Var;
        f41183f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new m5.e((i0) new ja0(23))), new k0("serif", "PhotoEditorTypefaceSerif", new m5.e((i0) new ja0(24))), new k0("condensed", "PhotoEditorTypefaceCondensed", new m5.e((i0) new ja0(25))), new k0("mono", "PhotoEditorTypefaceMono", new m5.e((i0) new ja0(26))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new m5.e((i0) new ja0(27))));
        f41184g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, m5.e eVar) {
        this.f41186a = str;
        this.f41187b = str2;
        this.f41188c = null;
        this.d = eVar;
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
            if (arrayList == null && !f41185i) {
                f41185i = true;
                Utilities.themeQueue.postRunnable(new u21(10));
            }
            return f41183f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f41180c];
        randomAccessFile.read(bArr);
        if (j0Var.f41178a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        m5.e eVar = this.d;
        if (((Typeface) eVar.f14954c) == null) {
            eVar.f14954c = ((i0) eVar.f14953b).a();
        }
        return (Typeface) eVar.f14954c;
    }

    public k0(Font font, String str) {
        this.f41186a = str;
        this.f41188c = str;
        this.f41187b = null;
        this.d = new m5.e((i0) new k2.v(font, 17));
    }
}
