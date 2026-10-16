package qg;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ji.m5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.b31;
import org.telegram.ui.ps0;
public final class j0 {
    public static final j0 e;
    public static final List f43199f;
    public static final List f43200g;
    public static ArrayList h;
    public static boolean f43201i;
    public final String f43202a;
    public final String f43203b;
    public final String f43204c;
    public final n3.b d;

    static {
        j0 j0Var = new j0("roboto", "PhotoEditorTypefaceRoboto", new n3.b(new ps0(21)));
        e = j0Var;
        f43199f = Arrays.asList(j0Var, new j0("italic", "PhotoEditorTypefaceItalic", new n3.b(new ps0(22))), new j0("serif", "PhotoEditorTypefaceSerif", new n3.b(new ps0(23))), new j0("condensed", "PhotoEditorTypefaceCondensed", new n3.b(new ps0(24))), new j0("mono", "PhotoEditorTypefaceMono", new n3.b(new ps0(25))), new j0("mw_bold", "PhotoEditorTypefaceMerriweather", new n3.b(new ps0(26))));
        f43200g = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    public j0(String str, String str2, n3.b bVar) {
        this.f43202a = str;
        this.f43203b = str2;
        this.f43204c = null;
        this.d = bVar;
    }

    public static void b() {
        throw new UnsupportedOperationException("Method not decompiled: qg.j0.b():void");
    }

    public static List c() {
        ArrayList arrayList = h;
        if (arrayList == null) {
            if (arrayList == null && !f43201i) {
                f43201i = true;
                Utilities.themeQueue.postRunnable(new b31(13));
            }
            return f43199f;
        }
        return arrayList;
    }

    public static String e(RandomAccessFile randomAccessFile, int i10, i0 i0Var) {
        Charset charset;
        if (i0Var == null) {
            return null;
        }
        randomAccessFile.seek(i10 + i0Var.d);
        byte[] bArr = new byte[i0Var.f43195c];
        randomAccessFile.read(bArr);
        if (i0Var.f43193a == 1) {
            charset = StandardCharsets.UTF_16BE;
        } else {
            charset = StandardCharsets.UTF_8;
        }
        return new String(bArr, charset);
    }

    public final Typeface d() {
        n3.b bVar = this.d;
        if (((Typeface) bVar.f15704c) == null) {
            bVar.f15704c = ((h0) bVar.f15703b).a();
        }
        return (Typeface) bVar.f15704c;
    }

    public j0(Font font, String str) {
        this.f43202a = str;
        this.f43204c = str;
        this.f43203b = null;
        this.d = new n3.b(new m5(font, 22));
    }
}
