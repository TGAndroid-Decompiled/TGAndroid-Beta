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
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cd0;
public final class x1 extends FrameLayout implements n0, fs {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public hi.l0 I;
    public final v1 J;
    public final TextureView K;
    public final j0.a L;
    public final fi.i0 M;
    public float N;
    public final s1 O;
    public final q1 P;
    public org.telegram.ui.Cells.t0 Q;
    public final m0 R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final kz f59064a;
    public final Paint f59065b;
    public final Paint f59066c;
    public final boolean d;
    public File f59067e;
    public float f59068f;
    public final String h;
    public final ImageReceiver f59069n;
    public u1 f59070r;
    public final int f59071s;
    public final int f59072w;
    public boolean f59073x;
    public boolean f59074y;

    public x1(android.content.Context r18, org.telegram.messenger.kz r19, int r20, int r21, org.telegram.ui.ActionBar.i6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ug.x1.<init>(android.content.Context, org.telegram.messenger.kz, int, int, org.telegram.ui.ActionBar.i6):void");
    }

    public final void a() {
        File file = this.f59067e;
        if ((file != null && file.exists()) || bz.B0) {
            File file2 = this.f59067e;
            if (file2 != null && file2.exists()) {
                if ((ks.e().f25350p & 512) != 0) {
                    u1 u1Var = this.f59070r;
                    if (u1Var != null) {
                        org.telegram.messenger.g0.r(u1Var);
                    }
                    u1 u1Var2 = new u1(this, 0);
                    this.f59070r = u1Var2;
                    org.telegram.messenger.g0.h3(u1Var2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f27013b, Uri.fromFile(this.f59067e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f59068f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f59068f = 0.671f;
                }
            } else {
                this.f59068f = 0.671f;
            }
            if (this.F) {
                b();
            }
        }
        this.f59070r = null;
    }

    public final void b() {
        Uri uri;
        int i7 = this.f59071s;
        if ((this.f59067e != null || bz.B0) && this.I == null) {
            this.J.a(this.f59068f, 0);
            hi.l0 l0Var = new hi.l0(this, 1);
            this.I = l0Var;
            TextureView textureView = this.K;
            l0Var.with(textureView);
            File file = this.f59067e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.f59067e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i7);
                    sb2.append("&id=");
                    sb2.append(this.S.f28498id);
                    sb2.append("&hash=");
                    sb2.append(this.S.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.S.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.S.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.S.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(w7.G(i7).F(ri.d0(i7).E));
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
                this.f59069n.R0();
                textureView.setAlpha(0.0f);
            }
            this.I.seekTo(this.U + 60);
            this.I.play();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f59073x && this.f59074y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E != z10) {
            this.E = z10;
            ImageReceiver imageReceiver = this.f59069n;
            if (z10) {
                imageReceiver.Q();
            } else {
                imageReceiver.S();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.f59067e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ug.x1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59074y = true;
        c();
        if (!this.G) {
            a();
        }
        ks.f(this.f59071s).c(this, ks.Y1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59074y = false;
        c();
        ks.f(this.f59071s).n(this, ks.Y1);
        org.telegram.ui.Cells.t0 t0Var = this.Q;
        if (t0Var != null) {
            HashMap hashMap = (HashMap) t0Var.f31894f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        hi.l0 l0Var = this.I;
        if (l0Var != null) {
            this.U = l0Var.getCurrentPosition();
            this.I.release(new cd0(27));
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
            m0 m0Var = this.R;
            if (m0Var != null) {
                RectF rectF = (RectF) m0Var.f58898c;
                ((Rect) m0Var.f58899e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.g0.P);
                rectF.inset(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            }
            s1 s1Var = this.O;
            if (s1Var != null) {
                RectF rectF2 = s1Var.f59013c;
                RectF rectF3 = s1Var.f59011a;
                int i13 = this.f59072w;
                if (i13 != 6 && i13 != 9 && i13 != 3 && i13 != 7 && i13 != 24 && i13 != 43 && i13 != 11 && i13 != 4) {
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    s1Var.f59012b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                }
                s1Var.f();
                rectF2.set(org.telegram.messenger.g0.P);
                rectF2.inset(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            }
            q1 q1Var = this.P;
            if (q1Var != null) {
                RectF rectF5 = q1Var.f58961a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                q1Var.f58962b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = q1Var.f58964e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((p1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.t0 t0Var = this.Q;
            if (t0Var != null) {
                ((RectF) t0Var.f31895g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.f31895g).inset(org.telegram.messenger.g0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.f31892c;
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
        v1 v1Var = this.J;
        v1Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.g0.P.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            org.telegram.messenger.g0.P.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = v1Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.g0.P;
        layoutParams.width = (int) rectF.width();
        v1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) v1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) v1Var.getLayoutParams()).topMargin = (int) rectF.top;
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
        if (z10 != this.f59073x) {
            this.f59073x = z10;
            c();
        }
        if (z12 != this.F) {
            this.F = z12;
            ImageReceiver imageReceiver = this.f59069n;
            imageReceiver.f22762u0 = z12;
            if (z12) {
                imageReceiver.Q0(false);
                b();
                return;
            }
            hi.l0 l0Var = this.I;
            if (l0Var != null) {
                this.U = l0Var.getCurrentPosition();
                this.I.release(new cd0(27));
                this.I = null;
            }
            imageReceiver.R0();
        }
    }
}
