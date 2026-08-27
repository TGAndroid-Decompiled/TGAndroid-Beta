package rh;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.er;

public final class o2 implements Runnable {

    public final int f47308a;

    public final Object f47309b;

    public final Object f47310c;

    public o2(int i10, Object obj, Object obj2) {
        this.f47308a = i10;
        this.f47309b = obj;
        this.f47310c = obj2;
    }

    private final void a() {
        z8.n nVar = (z8.n) this.f47309b;
        y9.b bVar = (y9.b) this.f47310c;
        synchronized (nVar) {
            try {
                if (nVar.f50248b == null) {
                    nVar.f50247a.add(bVar);
                } else {
                    nVar.f50248b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void run() {
        View viewZ1;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        y9.a aVar;
        switch (this.f47308a) {
            case 0:
                p3 p3Var = (p3) this.f47309b;
                y1 y1Var = (y1) this.f47310c;
                p3Var.getClass();
                long j10 = y1Var.f47602a;
                int i10 = y1Var.d;
                int i11 = y1Var.f47604c;
                ArrayList arrayList = p3Var.f47348h3;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        i12 = -1;
                    } else if (((a) arrayList.get(i12)).f47027a != j10) {
                        i12++;
                    }
                }
                if (i12 < 0) {
                    return;
                }
                KeyEvent.Callback callbackM = p3Var.T2.m(i12);
                if (callbackM instanceof t5) {
                    t5 t5Var = (t5) callbackM;
                    t5Var.B();
                    d1 editText = t5Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i11, length)), Math.max(0, Math.min(i10, length)));
                    return;
                }
                if (!(callbackM instanceof g5)) {
                    if (callbackM instanceof i0) {
                        d1 captionEditText = ((i0) callbackM).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i11, length2)), Math.max(0, Math.min(i10, length2)));
                        return;
                    }
                    return;
                }
                g5 g5Var = (g5) callbackM;
                d1 d1VarL = g5Var.l(y1Var.f47603b);
                if (d1VarL == null) {
                    d1VarL = g5Var.l(0);
                }
                if (d1VarL == null) {
                    return;
                }
                d1VarL.r();
                int length3 = d1VarL.length();
                d1VarL.setSelection(Math.max(0, Math.min(i11, length3)), Math.max(0, Math.min(i10, length3)));
                return;
            case 1:
                g3 g3Var = (g3) this.f47309b;
                a aVar2 = (a) this.f47310c;
                if (aVar2 == null) {
                    g3Var.getClass();
                    viewZ1 = null;
                } else {
                    viewZ1 = g3Var.f47156e.z1(aVar2);
                }
                if (viewZ1 instanceof t5) {
                    t5 t5Var2 = (t5) viewZ1;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(t5Var2.getEditText().length());
                    return;
                }
                return;
            case 2:
                s4 s4Var = (s4) this.f47309b;
                TLObject tLObject = (TLObject) this.f47310c;
                boolean z10 = s4Var.f47441e;
                boolean z11 = s4Var.d;
                r4 r4Var = s4Var.f47445s;
                if (s4Var.f47446w) {
                    return;
                }
                s4Var.f47448y = 0;
                if (s4Var.f47440c || z11 || z10) {
                    if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (!z10) {
                            if (z11) {
                                s4Var.f47447x = true;
                                s4Var.e();
                                r4Var.e(document);
                                return;
                            } else {
                                s4Var.f47447x = true;
                                s4Var.e();
                                r4Var.c(document);
                                return;
                            }
                        }
                        int i13 = s4Var.f47438a;
                        if (document.f22386id == 0 || document.access_hash == 0) {
                            s4Var.f47447x = true;
                            s4Var.e();
                            r4Var.onError();
                            return;
                        }
                        s4Var.f47447x = true;
                        s4Var.e();
                        if (!TextUtils.isEmpty(s4Var.B) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i13).setLocalPathTo(closestPhotoSizeWithSize, s4Var.B);
                            AndroidUtilities.copyFileSafe(new File(s4Var.B), FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        r4Var.d(document);
                        return;
                    }
                } else if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                    s4Var.f47447x = true;
                    s4Var.e();
                    r4Var.b(photo);
                    return;
                }
                s4Var.f47447x = true;
                s4Var.e();
                r4Var.onError();
                return;
            case 3:
                s4 s4Var2 = (s4) this.f47309b;
                String str = (String) this.f47310c;
                if (s4Var2.f47446w || s4Var2.f47447x) {
                    return;
                }
                s4Var2.a(str);
                return;
            case 4:
                j5 j5VarM = ((g5) this.f47309b).v.m((TL_iv.pageTableCell) this.f47310c);
                if (j5VarM == null) {
                    return;
                }
                d1 d1Var = j5VarM.f47226a;
                d1Var.r();
                d1Var.setSelection(d1Var.length());
                return;
            case 5:
                vd.b bVar = (vd.b) this.f47309b;
                View view = (View) this.f47310c;
                vd.a aVar3 = bVar.f48875a;
                if ((bVar.f48877c & 2) != 0) {
                    if (!aVar3.onLongPressRequestedAt(view, bVar.d, bVar.f48878e)) {
                        bVar.f48877c |= 8;
                        return;
                    }
                    bVar.f48877c &= -3;
                    bVar.f48876b = null;
                    float f10 = bVar.d;
                    float f11 = bVar.f48878e;
                    bVar.f48879f = f10;
                    bVar.f48880g = f11;
                    if (aVar3.ignoreHapticFeedbackSettings(f10, f11)) {
                        boolean zForceEnableVibration = aVar3.forceEnableVibration();
                        if (view != null) {
                            view.performHapticFeedback(0, zForceEnableVibration ? 2 : 0);
                        }
                    } else {
                        view.performHapticFeedback(0);
                    }
                    bVar.f48877c = (bVar.f48877c | 4) & (-11);
                    bVar.f48876b = null;
                    return;
                }
                return;
            case 6:
                yf.p0 p0Var = (yf.p0) this.f47309b;
                yf.w0 w0Var = (yf.w0) this.f47310c;
                p0Var.v = true;
                ByteBuffer byteBuffer = (ByteBuffer) p0Var.h(p0Var.f(), true, false, false).f48999c;
                RectF rectFF = p0Var.f();
                Object obj = p0Var.f50011a.f18088b;
                p0Var.f50030w = new b6.a(byteBuffer, 0, rectFF);
                p0Var.a(false);
                w0Var.run();
                return;
            case 7:
                yf.b1 b1Var = (yf.b1) this.f47309b;
                Runnable runnable = (Runnable) this.f47310c;
                yf.z0 z0Var = b1Var.d;
                if (z0Var == null || !z0Var.f50134f) {
                    return;
                }
                yf.z0.b(z0Var);
                runnable.run();
                return;
            case 8:
                z8.o oVar = (z8.o) this.f47309b;
                y9.b bVar2 = (y9.b) this.f47310c;
                if (oVar.f50251b != z8.o.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (oVar) {
                    aVar = oVar.f50250a;
                    oVar.f50250a = null;
                    oVar.f50251b = bVar2;
                    break;
                }
                aVar.b(bVar2);
                return;
            case 9:
                a();
                return;
            case 10:
                zf.l0 l0Var = (zf.l0) this.f47309b;
                zf.x1 x1Var = (zf.x1) this.f47310c;
                x1Var.m();
                l0Var.r0(x1Var, true);
                return;
            case 11:
                ((zf.x1) this.f47309b).s((Bitmap) this.f47310c);
                return;
            default:
                zf.n2 n2Var = (zf.n2) this.f47309b;
                ArrayList arrayList2 = (ArrayList) this.f47310c;
                n2Var.C = false;
                zf.k2[] k2VarArr = (zf.k2[]) arrayList2.toArray(new zf.k2[0]);
                n2Var.D = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.U.setScaleX(0.3f);
                    n2Var.U.setScaleY(0.3f);
                    n2Var.U.setAlpha(0.0f);
                    n2Var.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(er.f28122f).start();
                    return;
                }
                return;
        }
    }
}
