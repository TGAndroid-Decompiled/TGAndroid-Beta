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
import org.telegram.ui.df0;
import org.telegram.ui.fk0;
public final class m0 {
    public static final m0 e;
    public static final List f44554f;
    public static final List f44555g;
    public static ArrayList h;
    public static boolean f44556i;
    public final String f44557a;
    public final String f44558b;
    public final String f44559c;
    public final n2.e d;

    static {
        m0 m0Var = new m0("roboto", "PhotoEditorTypefaceRoboto", new n2.e(new fk0(25)));
        e = m0Var;
        f44554f = Arrays.asList(m0Var, new m0("italic", "PhotoEditorTypefaceItalic", new n2.e(new fk0(26))), new m0("serif", "PhotoEditorTypefaceSerif", new n2.e(new fk0(27))), new m0("condensed", "PhotoEditorTypefaceCondensed", new n2.e(new fk0(28))), new m0("mono", "PhotoEditorTypefaceMono", new n2.e(new fk0(29))), new m0("mw_bold", "PhotoEditorTypefaceMerriweather", new n2.e(new f0(0))));
        f44555g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public m0(String str, String str2, n2.e eVar) {
        this.f44557a = str;
        this.f44558b = str2;
        this.f44559c = null;
        this.d = eVar;
    }

    public static Typeface a(Font font) {
        return Typeface.createFromFile(font.getFile());
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: qg.m0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f44556i) {
                f44556i = true;
                Utilities.themeQueue.postRunnable(new df0(16));
            }
            return f44554f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, l0 l0Var) {
        Charset charset;
        if (l0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + l0Var.d);
        byte[] bArr = new byte[l0Var.f44549c];
        randomAccessFile.read(bArr);
        if (l0Var.f44547a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n2.e eVar = this.d;
        if (((Typeface) eVar.f17040c) == null) {
            eVar.f17040c = ((k0) eVar.f17039b).a();
        }
        return (Typeface) eVar.f17040c;
    }

    public m0(Font font, String str) {
        this.f44557a = str;
        this.f44559c = str;
        this.f44558b = null;
        this.d = new n2.e(new h0(font, 0));
    }
}
