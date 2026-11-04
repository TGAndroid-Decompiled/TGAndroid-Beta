package w9;

import a0.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.support.v4.media.session.a0;
import android.util.Log;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import ba.i;
import fa.f;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import y7.qa;
public final class b implements zd.b {
    public final int f57423a;
    public Object f57424b;
    public Object f57425c;

    @Override
    public java.lang.Object U(zd.c r7, hd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: w9.b.U(zd.c, hd.c):java.lang.Object");
    }

    public void a() {
        String str = (String) this.f57424b;
        try {
            f fVar = (f) this.f57425c;
            fVar.getClass();
            new File((File) fVar.d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void b(String str, PrintWriter printWriter) {
        boolean z10;
        y1.b bVar = (y1.b) this.f57425c;
        if (bVar.d.f34c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i3 = 0;
            while (true) {
                m mVar = bVar.d;
                if (i3 < mVar.f34c) {
                    y1.a aVar = (y1.a) mVar.f33b[i3];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f32a[i3]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f58891l);
                    c6.d dVar = aVar.f58891l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f4221a);
                    if (dVar.f4222b || dVar.f4224e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f4222b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f4224e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f4223c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f4223c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f4226g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f4226g);
                        printWriter.print(" waiting=");
                        dVar.f4226g.getClass();
                        printWriter.println(false);
                    }
                    if (dVar.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(dVar.h);
                        printWriter.print(" waiting=");
                        dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (aVar.f58893n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f58893n);
                        i iVar = aVar.f58893n;
                        iVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(iVar.f3186b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    c6.d dVar2 = aVar.f58891l;
                    Object obj2 = aVar.f2038e;
                    if (obj2 != z.f2034k) {
                        obj = obj2;
                    }
                    dVar2.getClass();
                    StringBuilder sb2 = new StringBuilder(64);
                    if (obj == null) {
                        sb2.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb2.append(cls.getSimpleName());
                        sb2.append("{");
                        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb2.append("}");
                    }
                    printWriter.println(sb2.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f2037c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        switch (this.f57423a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((t) this.f57424b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b(int i3, Object obj, Object obj2) {
        this.f57423a = i3;
        this.f57424b = obj;
        this.f57425c = obj2;
    }

    public b(p7.d dVar) {
        this.f57423a = 2;
        this.f57425c = new Object();
        this.f57424b = dVar;
        qa.b();
    }

    public b(Context context) {
        this.f57423a = 0;
        this.f57424b = context;
        this.f57425c = null;
    }

    public b(t tVar, t0 t0Var) {
        this.f57423a = 1;
        this.f57424b = tVar;
        this.f57425c = (y1.b) new a0(t0Var, y1.b.f58894f).h(y1.b.class);
    }

    public b(int i3) {
        this.f57423a = 3;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ALPHA_8);
        this.f57424b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f57425c = new BitmapShader(createBitmap, tileMode, tileMode);
    }
}
