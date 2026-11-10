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
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.q61;
public final class t1 extends FrameLayout implements l0, ls {
    public static final float[] U = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean D;
    public boolean E;
    public boolean F;
    public float G;
    public fi.c0 H;
    public final r1 I;
    public final TextureView J;
    public final j0.a K;
    public final di.j0 L;
    public float M;
    public final p1 N;
    public final n1 O;
    public org.telegram.ui.Cells.r0 P;
    public final k0 Q;
    public final TLRPC.Document R;
    public int S;
    public long T;
    public final rz f56828a;
    public final Paint f56829b;
    public final Paint f56830c;
    public final boolean d;
    public File f56831e;
    public float f56832f;
    public final String h;
    public final ImageReceiver f56833n;
    public sh.b f56834r;
    public final int f56835s;
    public final int f56836w;
    public boolean f56837x;
    public boolean f56838y;

    public t1(android.content.Context r18, org.telegram.messenger.rz r19, int r20, int r21, org.telegram.ui.ActionBar.h6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ug.t1.<init>(android.content.Context, org.telegram.messenger.rz, int, int, org.telegram.ui.ActionBar.h6):void");
    }

    public final void a() {
        File file = this.f56831e;
        if ((file != null && file.exists()) || iz.B0) {
            File file2 = this.f56831e;
            if (file2 != null && file2.exists()) {
                if ((qs.e().f25141p & 512) != 0) {
                    sh.b bVar = this.f56834r;
                    if (bVar != null) {
                        org.telegram.messenger.g0.r(bVar);
                    }
                    sh.b bVar2 = new sh.b(this, 19);
                    this.f56834r = bVar2;
                    org.telegram.messenger.g0.i3(bVar2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(org.telegram.messenger.t0.f25570b, Uri.fromFile(this.f56831e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f56832f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f56832f = 0.671f;
                }
            } else {
                this.f56832f = 0.671f;
            }
            if (this.E) {
                b();
            }
        }
        this.f56834r = null;
    }

    public final void b() {
        Uri uri;
        int i7 = this.f56835s;
        if ((this.f56831e != null || iz.B0) && this.H == null) {
            this.I.a(this.f56832f, 0);
            fi.c0 c0Var = new fi.c0(this, 1);
            this.H = c0Var;
            TextureView textureView = this.J;
            c0Var.with(textureView);
            File file = this.f56831e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.f56831e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i7);
                    sb2.append("&id=");
                    sb2.append(this.R.f26966id);
                    sb2.append("&hash=");
                    sb2.append(this.R.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.R.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.R.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.R.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(w7.G(i7).F(ui.b0(i7).D));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(w7.B(this.R), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.R.file_reference;
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
            this.H.preparePlayer(uri, false, 1.0f);
            if (!this.F) {
                this.f56833n.Q0();
                textureView.setAlpha(0.0f);
            }
            this.H.seekTo(this.T + 60);
            this.H.play();
        }
    }

    public final void c() {
        boolean z9;
        if (this.f56837x && this.f56838y) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.D != z9) {
            this.D = z9;
            ImageReceiver imageReceiver = this.f56833n;
            if (z9) {
                imageReceiver.P();
            } else {
                imageReceiver.R();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.Y1) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.f56831e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ug.t1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f56838y = true;
        c();
        if (!this.F) {
            a();
        }
        qs.f(this.f56835s).c(this, qs.Y1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f56838y = false;
        c();
        qs.f(this.f56835s).n(this, qs.Y1);
        org.telegram.ui.Cells.r0 r0Var = this.P;
        if (r0Var != null) {
            HashMap hashMap = (HashMap) r0Var.f30189f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.P = null;
        }
        fi.c0 c0Var = this.H;
        if (c0Var != null) {
            this.T = c0Var.getCurrentPosition();
            this.H.release(new q61(20));
            this.H = null;
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            org.telegram.messenger.g0.P.set(measuredWidth2, -this.M, getMeasuredWidth() - measuredWidth2, min);
        } else {
            org.telegram.messenger.g0.P.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.M);
        }
        if (this.S != measuredWidth) {
            this.S = measuredWidth;
            k0 k0Var = this.Q;
            if (k0Var != null) {
                RectF rectF = (RectF) k0Var.f56688c;
                ((Rect) k0Var.f56689e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(org.telegram.messenger.g0.P);
                rectF.inset(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
            }
            p1 p1Var = this.N;
            if (p1Var != null) {
                RectF rectF2 = p1Var.f56777c;
                RectF rectF3 = p1Var.f56775a;
                int i13 = this.f56836w;
                if (i13 != 6 && i13 != 9 && i13 != 3 && i13 != 7 && i13 != 24 && i13 != 43 && i13 != 11 && i13 != 4) {
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    p1Var.f56776b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                }
                p1Var.f();
                rectF2.set(org.telegram.messenger.g0.P);
                rectF2.inset(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            }
            n1 n1Var = this.O;
            if (n1Var != null) {
                RectF rectF5 = n1Var.f56730a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                n1Var.f56731b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = n1Var.f56733e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((m1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.r0 r0Var = this.P;
            if (r0Var != null) {
                ((RectF) r0Var.f30190g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.f30190g).inset(org.telegram.messenger.g0.L(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.P.f30187c;
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
        this.M = 0.0671f * min;
        r1 r1Var = this.I;
        r1Var.invalidateOutline();
        if (this.d) {
            org.telegram.messenger.g0.P.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            org.telegram.messenger.g0.P.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = r1Var.getLayoutParams();
        RectF rectF = org.telegram.messenger.g0.P;
        layoutParams.width = (int) rectF.width();
        r1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) r1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) r1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i7, i10);
    }

    @Override
    public void setOffset(float f10) {
        boolean z9;
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        boolean z10 = this.d;
        boolean z11 = true;
        if (i7 < 0) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.i(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z10) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.G = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (measuredWidth >= 0.1f) {
                z11 = false;
            }
        } else {
            float measuredWidth2 = (-f10) / getMeasuredWidth();
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (z10) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            if (measuredWidth2 > -1.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (measuredWidth2 <= -0.1f) {
                z11 = false;
            }
            this.G = Math.abs(measuredWidth2);
        }
        if (z9 != this.f56837x) {
            this.f56837x = z9;
            c();
        }
        if (z11 != this.E) {
            this.E = z11;
            ImageReceiver imageReceiver = this.f56833n;
            imageReceiver.f21225t0 = z11;
            if (z11) {
                imageReceiver.P0(false);
                b();
                return;
            }
            fi.c0 c0Var = this.H;
            if (c0Var != null) {
                this.T = c0Var.getCurrentPosition();
                this.H.release(new q61(20));
                this.H = null;
            }
            imageReceiver.Q0();
        }
    }
}
