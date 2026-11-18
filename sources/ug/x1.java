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
import org.telegram.messenger.lz;
import org.telegram.messenger.ri;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dd0;
public final class x1 extends FrameLayout implements o0, fs {
    public static final float[] V = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public boolean G;
    public float H;
    public hi.d0 I;
    public final v1 J;
    public final TextureView K;
    public final j0.a L;
    public final fi.i0 M;
    public float N;
    public final t1 O;
    public final r1 P;
    public org.telegram.ui.Cells.t0 Q;
    public final n0 R;
    public final TLRPC.Document S;
    public int T;
    public long U;
    public final lz f58936a;
    public final Paint f58937b;
    public final Paint f58938c;
    public final boolean d;
    public File f58939e;
    public float f58940f;
    public final String h;
    public final ImageReceiver f58941n;
    public org.telegram.ui.web.z0 f58942r;
    public final int f58943s;
    public final int f58944w;
    public boolean f58945x;
    public boolean f58946y;

    public x1(android.content.Context r18, org.telegram.messenger.lz r19, int r20, int r21, org.telegram.ui.ActionBar.i6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ug.x1.<init>(android.content.Context, org.telegram.messenger.lz, int, int, org.telegram.ui.ActionBar.i6):void");
    }

    public final void a() {
        File file = this.f58939e;
        if ((file != null && file.exists()) || bz.B0) {
            File file2 = this.f58939e;
            if (file2 != null && file2.exists()) {
                if ((ks.e().f25251p & 512) != 0) {
                    org.telegram.ui.web.z0 z0Var = this.f58942r;
                    if (z0Var != null) {
                        org.telegram.messenger.g0.r(z0Var);
                    }
                    org.telegram.ui.web.z0 z0Var2 = new org.telegram.ui.web.z0(this, 29);
                    this.f58942r = z0Var2;
                    org.telegram.messenger.g0.h3(z0Var2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f26913b, Uri.fromFile(this.f58939e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f58940f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f58940f = 0.671f;
                }
            } else {
                this.f58940f = 0.671f;
            }
            if (this.F) {
                b();
            }
        }
        this.f58942r = null;
    }

    public final void b() {
        Uri uri;
        int i7 = this.f58943s;
        if ((this.f58939e != null || bz.B0) && this.I == null) {
            this.J.a(this.f58940f, 0);
            hi.d0 d0Var = new hi.d0(this, 1);
            this.I = d0Var;
            TextureView textureView = this.K;
            d0Var.with(textureView);
            File file = this.f58939e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.f58939e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i7);
                    sb2.append("&id=");
                    sb2.append(this.S.f28409id);
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
                this.f58941n.Q0();
                textureView.setAlpha(0.0f);
            }
            this.I.seekTo(this.U + 60);
            this.I.play();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f58945x && this.f58946y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E != z10) {
            this.E = z10;
            ImageReceiver imageReceiver = this.f58941n;
            if (z10) {
                imageReceiver.P();
            } else {
                imageReceiver.R();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.f58939e = (File) objArr[1];
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
        this.f58946y = true;
        c();
        if (!this.G) {
            a();
        }
        ks.f(this.f58943s).c(this, ks.Y1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58946y = false;
        c();
        ks.f(this.f58943s).n(this, ks.Y1);
        org.telegram.ui.Cells.t0 t0Var = this.Q;
        if (t0Var != null) {
            HashMap hashMap = (HashMap) t0Var.f31801f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.Q = null;
        }
        hi.d0 d0Var = this.I;
        if (d0Var != null) {
            this.U = d0Var.getCurrentPosition();
            this.I.release(new dd0(27));
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
            n0 n0Var = this.R;
            if (n0Var != null) {
                RectF rectF = (RectF) n0Var.f58781c;
                ((Rect) n0Var.f58782e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.g0.P);
                rectF.inset(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            }
            t1 t1Var = this.O;
            if (t1Var != null) {
                RectF rectF2 = t1Var.f58895c;
                RectF rectF3 = t1Var.f58893a;
                int i13 = this.f58944w;
                if (i13 != 6 && i13 != 9 && i13 != 3 && i13 != 7 && i13 != 24 && i13 != 43 && i13 != 11 && i13 != 4) {
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    t1Var.f58894b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                }
                t1Var.f();
                rectF2.set(org.telegram.messenger.g0.P);
                rectF2.inset(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            }
            r1 r1Var = this.P;
            if (r1Var != null) {
                RectF rectF5 = r1Var.f58852a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                r1Var.f58853b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = r1Var.f58855e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((q1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.t0 t0Var = this.Q;
            if (t0Var != null) {
                ((RectF) t0Var.f31802g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.Q.f31802g).inset(org.telegram.messenger.g0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.Q.f31799c;
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
        if (z10 != this.f58945x) {
            this.f58945x = z10;
            c();
        }
        if (z12 != this.F) {
            this.F = z12;
            ImageReceiver imageReceiver = this.f58941n;
            imageReceiver.f22664u0 = z12;
            if (z12) {
                imageReceiver.P0(false);
                b();
                return;
            }
            hi.d0 d0Var = this.I;
            if (d0Var != null) {
                this.U = d0Var.getCurrentPosition();
                this.I.release(new dd0(27));
                this.I = null;
            }
            imageReceiver.Q0();
        }
    }
}
