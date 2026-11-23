package sg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.cd0;
public final class a0 {
    public static final a0 f57195e;
    public static final List f57196f;
    public static final List f57197g;
    public static ArrayList h;
    public static boolean f57198i;
    public final String f57199a;
    public final String f57200b;
    public final String f57201c;
    public final ji.l d;

    static {
        a0 a0Var = new a0("roboto", "PhotoEditorTypefaceRoboto", new ji.l(new r0.f1(18), 28));
        f57195e = a0Var;
        f57196f = Arrays.asList(a0Var, new a0("italic", "PhotoEditorTypefaceItalic", new ji.l(new r0.f1(19), 28)), new a0("serif", "PhotoEditorTypefaceSerif", new ji.l(new r0.f1(20), 28)), new a0("condensed", "PhotoEditorTypefaceCondensed", new ji.l(new r0.f1(21), 28)), new a0("mono", "PhotoEditorTypefaceMono", new ji.l(new r0.f1(22), 28)), new a0("mw_bold", "PhotoEditorTypefaceMerriweather", new ji.l(new r0.f1(23), 28)));
        f57197g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public a0(String str, String str2, ji.l lVar) {
        this.f57199a = str;
        this.f57200b = str2;
        this.f57201c = null;
        this.d = lVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f57198i) {
                f57198i = true;
                Utilities.f22813i.c(new cd0(22));
            }
            return f57196f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, z zVar) {
        Charset charset;
        if (zVar == null) {
            return null;
        }
        randomAccessFile.seek(i7 + zVar.d);
        byte[] bArr = new byte[zVar.f57456c];
        randomAccessFile.read(bArr);
        if (zVar.f57454a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        ji.l lVar = this.d;
        if (((Typeface) lVar.f17980c) == null) {
            lVar.f17980c = ((y) lVar.f17979b).a();
        }
        return (Typeface) lVar.f17980c;
    }

    public a0(Font font, String str) {
        this.f57199a = str;
        this.f57201c = str;
        this.f57200b = null;
        this.d = new ji.l(new org.telegram.tgnet.u(font, 23), 28);
    }
}
