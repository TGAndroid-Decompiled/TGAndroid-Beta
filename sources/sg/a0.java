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
    public static final a0 f57274e;
    public static final List f57275f;
    public static final List f57276g;
    public static ArrayList h;
    public static boolean f57277i;
    public final String f57278a;
    public final String f57279b;
    public final String f57280c;
    public final j6.k d;

    static {
        a0 a0Var = new a0("roboto", "PhotoEditorTypefaceRoboto", new j6.k(new r0.f1(18), 29));
        f57274e = a0Var;
        f57275f = Arrays.asList(a0Var, new a0("italic", "PhotoEditorTypefaceItalic", new j6.k(new r0.f1(19), 29)), new a0("serif", "PhotoEditorTypefaceSerif", new j6.k(new r0.f1(20), 29)), new a0("condensed", "PhotoEditorTypefaceCondensed", new j6.k(new r0.f1(21), 29)), new a0("mono", "PhotoEditorTypefaceMono", new j6.k(new r0.f1(22), 29)), new a0("mw_bold", "PhotoEditorTypefaceMerriweather", new j6.k(new r0.f1(23), 29)));
        f57276g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public a0(String str, String str2, j6.k kVar) {
        this.f57278a = str;
        this.f57279b = str2;
        this.f57280c = null;
        this.d = kVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f57277i) {
                f57277i = true;
                Utilities.f22880i.c(new cd0(22));
            }
            return f57275f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i7, z zVar) {
        Charset charset;
        if (zVar == null) {
            return null;
        }
        randomAccessFile.seek(i7 + zVar.d);
        byte[] bArr = new byte[zVar.f57531c];
        randomAccessFile.read(bArr);
        if (zVar.f57529a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        j6.k kVar = this.d;
        if (((Typeface) kVar.f17344c) == null) {
            kVar.f17344c = ((y) kVar.f17343b).a();
        }
        return (Typeface) kVar.f17344c;
    }

    public a0(Font font, String str) {
        this.f57278a = str;
        this.f57280c = str;
        this.f57279b = null;
        this.d = new j6.k(new org.telegram.tgnet.g(font, 25), 29);
    }
}
