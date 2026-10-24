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
import org.telegram.ui.hf0;
public final class l0 {
    public static final l0 e;
    public static final List f44974f;
    public static final List f44975g;
    public static ArrayList h;
    public static boolean f44976i;
    public final String f44977a;
    public final String f44978b;
    public final String f44979c;
    public final n2.e d;

    static {
        l0 l0Var = new l0("roboto", "PhotoEditorTypefaceRoboto", new n2.e(new org.telegram.ui.web.d0(7)));
        e = l0Var;
        f44974f = Arrays.asList(l0Var, new l0("italic", "PhotoEditorTypefaceItalic", new n2.e(new org.telegram.ui.web.d0(8))), new l0("serif", "PhotoEditorTypefaceSerif", new n2.e(new org.telegram.ui.web.d0(9))), new l0("condensed", "PhotoEditorTypefaceCondensed", new n2.e(new org.telegram.ui.web.d0(10))), new l0("mono", "PhotoEditorTypefaceMono", new n2.e(new org.telegram.ui.web.d0(11))), new l0("mw_bold", "PhotoEditorTypefaceMerriweather", new n2.e(new org.telegram.ui.web.d0(12))));
        f44975g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public l0(String str, String str2, n2.e eVar) {
        this.f44977a = str;
        this.f44978b = str2;
        this.f44979c = null;
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
            if (arrayList == null && !f44976i) {
                f44976i = true;
                Utilities.themeQueue.postRunnable(new hf0(16));
            }
            return f44974f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, k0 k0Var) {
        Charset charset;
        if (k0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + k0Var.d);
        byte[] bArr = new byte[k0Var.f44969c];
        randomAccessFile.read(bArr);
        if (k0Var.f44967a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n2.e eVar = this.d;
        if (((Typeface) eVar.f17103c) == null) {
            eVar.f17103c = ((j0) eVar.f17102b).a();
        }
        return (Typeface) eVar.f17103c;
    }

    public l0(Font font, String str) {
        this.f44977a = str;
        this.f44979c = str;
        this.f44978b = null;
        this.d = new n2.e(new g0(font, 0));
    }
}
