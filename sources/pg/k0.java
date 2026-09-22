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
    public static final List f41203f;
    public static final List f41204g;
    public static ArrayList h;
    public static boolean f41205i;
    public final String f41206a;
    public final String f41207b;
    public final String f41208c;
    public final m5.e d;

    static {
        k0 k0Var = new k0("roboto", "PhotoEditorTypefaceRoboto", new m5.e((i0) new ja0(22)));
        e = k0Var;
        f41203f = Arrays.asList(k0Var, new k0("italic", "PhotoEditorTypefaceItalic", new m5.e((i0) new ja0(23))), new k0("serif", "PhotoEditorTypefaceSerif", new m5.e((i0) new ja0(24))), new k0("condensed", "PhotoEditorTypefaceCondensed", new m5.e((i0) new ja0(25))), new k0("mono", "PhotoEditorTypefaceMono", new m5.e((i0) new ja0(26))), new k0("mw_bold", "PhotoEditorTypefaceMerriweather", new m5.e((i0) new ja0(27))));
        f41204g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public k0(String str, String str2, m5.e eVar) {
        this.f41206a = str;
        this.f41207b = str2;
        this.f41208c = null;
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
            if (arrayList == null && !f41205i) {
                f41205i = true;
                Utilities.themeQueue.postRunnable(new u21(10));
            }
            return f41203f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, j0 j0Var) {
        Charset charset;
        if (j0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + j0Var.d);
        byte[] bArr = new byte[j0Var.f41200c];
        randomAccessFile.read(bArr);
        if (j0Var.f41198a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        m5.e eVar = this.d;
        if (((Typeface) eVar.f14969c) == null) {
            eVar.f14969c = ((i0) eVar.f14968b).a();
        }
        return (Typeface) eVar.f14969c;
    }

    public k0(Font font, String str) {
        this.f41206a = str;
        this.f41208c = str;
        this.f41207b = null;
        this.d = new m5.e((i0) new k2.v(font, 17));
    }
}
