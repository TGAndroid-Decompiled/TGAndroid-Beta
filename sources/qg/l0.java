package qg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ff0;
import org.telegram.ui.hk0;
public final class l0 {
    public static final l0 e;
    public static final List f44596f;
    public static final List f44597g;
    public static ArrayList h;
    public static boolean f44598i;
    public final String f44599a;
    public final String f44600b;
    public final String f44601c;
    public final n2.e d;

    static {
        l0 l0Var = new l0("roboto", "PhotoEditorTypefaceRoboto", new n2.e(new hk0(24)));
        e = l0Var;
        f44596f = Arrays.asList(l0Var, new l0("italic", "PhotoEditorTypefaceItalic", new n2.e(new hk0(25))), new l0("serif", "PhotoEditorTypefaceSerif", new n2.e(new hk0(26))), new l0("condensed", "PhotoEditorTypefaceCondensed", new n2.e(new hk0(27))), new l0("mono", "PhotoEditorTypefaceMono", new n2.e(new hk0(28))), new l0("mw_bold", "PhotoEditorTypefaceMerriweather", new n2.e(new hk0(29))));
        f44597g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public l0(String str, String str2, n2.e eVar) {
        this.f44599a = str;
        this.f44600b = str2;
        this.f44601c = null;
        this.d = eVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: qg.l0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f44598i) {
                f44598i = true;
                Utilities.themeQueue.postRunnable(new ff0(15));
            }
            return f44596f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, k0 k0Var) {
        Charset charset;
        if (k0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + k0Var.d);
        byte[] bArr = new byte[k0Var.f44591c];
        randomAccessFile.read(bArr);
        if (k0Var.f44589a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n2.e eVar = this.d;
        if (((Typeface) eVar.f17043c) == null) {
            eVar.f17043c = ((j0) eVar.f17042b).a();
        }
        return (Typeface) eVar.f17043c;
    }

    public l0(Font font, String str) {
        this.f44599a = str;
        this.f44601c = str;
        this.f44600b = null;
        this.d = new n2.e(new g0(font, 0));
    }
}
