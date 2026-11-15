package ug;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gz;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.si;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ah0;
public final class w1 extends FrameLayout implements m0, is {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public hi.c0 I;
    public final u1 J;
    public final TextureView K;
    public final j0.a L;
    public final fi.j0 M;
    public float N;
    public final r1 O;
    public final o1 P;
    public org.telegram.ui.Cells.r0 Q;
    public final l0 R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final pz f58358a;
    public final Paint f58359b;
    public final Paint f58360c;
    public final boolean d;
    public File f58361e;
    public float f58362f;
    public final String h;
    public final ImageReceiver f58363n;
    public q2.d f58364r;
    public final int f58365s;
    public final int f58366w;
    public boolean f58367x;
    public boolean f58368y;

    public w1(android.content.Context r18, org.telegram.messenger.pz r19, int r20, int r21, org.telegram.ui.ActionBar.e6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ug.w1.<init>(android.content.Context, org.telegram.messenger.pz, int, int, org.telegram.ui.ActionBar.e6):void");
    }

    public final void a() {
        File file = this.f58361e;
        if ((file != null && file.exists()) || gz.B0) {
            File file2 = this.f58361e;
            if (file2 != null && file2.exists()) {
                if ((ns.e().f25634p & 512) != 0) {
                    q2.d dVar = this.f58364r;
                    if (dVar != null) {
                        org.telegram.messenger.g0.r(dVar);
                    }
                    q2.d dVar2 = new q2.d(this, 26);
                    this.f58364r = dVar2;
                    org.telegram.messenger.g0.i3(dVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f26609b, Uri.fromFile(this.f58361e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f58362f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f58362f = 0.671f;
                }
            } else {
                this.f58362f = 0.671f;
            }
            if (this.F) {
                b();
            }
        }
        this.f58364r = null;
    }

    public final void b() {
        Uri uri;
        int i7 = this.f58365s;
        if ((this.f58361e != null || gz.B0) && this.I == null) {
            this.J.a(this.f58362f, 0);
            hi.c0 c0Var = new hi.c0(this, 1);
            this.I = c0Var;
            TextureView textureView = this.K;
            c0Var.with(textureView);
            File file = this.f58361e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.f58361e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i7);
                    sb2.append("&id=");
                    sb2.append(this.S.f28057id);
                    sb2.append("&hash=");
                    sb2.append(this.S.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.S.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.S.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.S.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(w7.G(i7).F(si.b0(i7).E));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(w7.B(this.S), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.S.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.f(bArr));
                    String sb3 = sb2.toString();
                    uri = Uri.parse("tg://" + this.h + sb3);
                } catch (Exception unused) {
                    uri = null;
                }
            }
            if (uri == null) {
                return;
            }
            this.I.preparePlayer(uri, false, 1.0f);
            if (!this.G) {
                this.f58363n.Q0();
                textureView.setAlpha(0.0f);
            }
            this.I.seekTo(this.U + 60);
            this.I.play();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f58367x && this.f58368y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E != z10) {
            this.E = z10;
            ImageReceiver imageReceiver = this.f58363n;
            if (z10) {
                imageReceiver.P();
            } else {
                imageReceiver.R();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.f58361e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ug.w1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58368y = true;
        c();
        if (!this.G) {
            a();
        }
        ns.f(this.f58365s).c(this, ns.Y1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58368y = false;
        c();
        ns.f(this.f58365s).n(this, ns.Y1);
        org.telegram.ui.Cells.r0 r0Var = this.Q;
        if (r0Var != null) {
            HashMap hashMap = (HashMap) r0Var.f31327f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        hi.c0 c0Var = this.I;
        if (c0Var != null) {
            this.U = c0Var.getCurrentPosition();
            this.I.release(new ah0(24));
            this.I = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            org.telegram.messenger.g0.P.set(measuredWidth2, -this.N, getMeasuredWidth() - measuredWidth2, min);
        } else {
            org.telegram.messenger.g0.P.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.N);
        }
        if (this.T != measuredWidth) {
            this.T = measuredWidth;
            l0 l0Var = this.R;
            if (l0Var != null) {
                RectF rectF = (RectF) l0Var.f58198c;
                ((Rect) l0Var.f58199e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.g0.P);
                rectF.inset(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            }
            r1 r1Var = this.O;
            if (r1Var != null) {
                RectF rectF2 = r1Var.f58307c;
                RectF rectF3 = r1Var.f58305a;
                int i13 = this.f58366w;
                if (i13 != 6 && i13 != 9 && i13 != 3 && i13 != 7 && i13 != 24 && i13 != 43 && i13 != 11 && i13 != 4) {
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    r1Var.f58306b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                }
                r1Var.f();
                rectF2.set(org.telegram.messenger.g0.P);
                rectF2.inset(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            }
            o1 o1Var = this.P;
            if (o1Var != null) {
                RectF rectF5 = o1Var.f58243a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                o1Var.f58244b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = o1Var.f58246e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((n1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.r0 r0Var = this.Q;
            if (r0Var != null) {
                ((RectF) r0Var.f31328g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.f31328g).inset(org.telegram.messenger.g0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.f31325c;
                System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    ((k) arrayList2.get(i15)).a(i15, true);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.N = 0.0671f * min;
        u1 u1Var = this.J;
        u1Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.g0.P.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            org.telegram.messenger.g0.P.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = u1Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.g0.P;
        layoutParams.width = (int) rectF.width();
        u1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) u1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) u1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i7, i10);
    }

    @Override
    public void setOffset(float f10) {
        boolean z10;
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        boolean z11 = this.d;
        boolean z12 = true;
        if (i7 < 0) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.H = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth >= 0.1f) {
                z12 = false;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z11) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            if (measuredWidth2 > -1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth2 <= -0.1f) {
                z12 = false;
            }
            this.H = Math.abs(measuredWidth2);
        }
        if (z10 != this.f58367x) {
            this.f58367x = z10;
            c();
        }
        if (z12 != this.F) {
            this.F = z12;
            ImageReceiver imageReceiver = this.f58363n;
            imageReceiver.f22301u0 = z12;
            if (z12) {
                imageReceiver.P0(false);
                b();
                return;
            }
            hi.c0 c0Var = this.I;
            if (c0Var != null) {
                this.U = c0Var.getCurrentPosition();
                this.I.release(new ah0(24));
                this.I = null;
            }
            imageReceiver.Q0();
        }
    }
}
