package zf;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lj0;
public final class z1 extends FrameLayout implements l0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] Q = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean A;
    public boolean B;
    public float C;
    public kh.d0 D;
    public final x1 E;
    public final TextureView F;
    public final j0.a G;
    public final org.telegram.ui.Components.voip.g H;
    public float I;
    public final v1 J;
    public final t1 K;
    public org.telegram.ui.Cells.u0 L;
    public final f2.b M;
    public final TLRPC.Document N;
    public int O;
    public long P;
    public final SvgHelper.SvgDrawable f50803a;
    public final Paint f50804b;
    public final Paint f50805c;
    public final boolean d;
    public File f50806e;
    public float f50807f;
    public final String h;
    public final ImageReceiver f50808n;
    public q1 f50809r;
    public final int f50810s;
    public final int v;
    public boolean f50811w;
    public boolean f50812x;
    public boolean f50813y;

    public z1(android.content.Context r18, org.telegram.messenger.SvgHelper.SvgDrawable r19, int r20, int r21, org.telegram.ui.ActionBar.b6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: zf.z1.<init>(android.content.Context, org.telegram.messenger.SvgHelper$SvgDrawable, int, int, org.telegram.ui.ActionBar.b6):void");
    }

    public final void a() {
        File file = this.f50806e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.f50806e;
            if (file2 != null && file2.exists()) {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    q1 q1Var = this.f50809r;
                    if (q1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(q1Var);
                    }
                    q1 q1Var2 = new q1(1, this);
                    this.f50809r = q1Var2;
                    AndroidUtilities.runOnUIThread(q1Var2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.f50806e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f50807f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f50807f = 0.671f;
                }
            } else {
                this.f50807f = 0.671f;
            }
            if (this.A) {
                b();
            }
        }
        this.f50809r = null;
    }

    public final void b() {
        Uri uri;
        int i9 = this.f50810s;
        if ((this.f50806e != null || SharedConfig.streamMedia) && this.D == null) {
            this.E.a(this.f50807f, 0);
            kh.d0 d0Var = new kh.d0(this, 1);
            this.D = d0Var;
            TextureView textureView = this.F;
            d0Var.with(textureView);
            File file = this.f50806e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.f50806e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i9);
                    sb2.append("&id=");
                    sb2.append(this.N.f22386id);
                    sb2.append("&hash=");
                    sb2.append(this.N.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.N.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.N.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.N.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(FileLoader.getInstance(i9).getFileReference(MediaDataController.getInstance(i9).getPremiumPromo()));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.N), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.N.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    sb2.append(Utilities.bytesToHex(bArr));
                    String sb3 = sb2.toString();
                    uri = Uri.parse("tg://" + this.h + sb3);
                } catch (Exception unused) {
                    uri = null;
                }
            }
            if (uri == null) {
                return;
            }
            this.D.preparePlayer(uri, false, 1.0f);
            if (!this.B) {
                this.f50808n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.D.seekTo(this.P + 60);
            this.D.play();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f50811w && this.f50812x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50813y != z10) {
            this.f50813y = z10;
            ImageReceiver imageReceiver = this.f50808n;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver.onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.f50806e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: zf.z1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50812x = true;
        c();
        if (!this.B) {
            a();
        }
        NotificationCenter.getInstance(this.f50810s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50812x = false;
        c();
        NotificationCenter.getInstance(this.f50810s).removeObserver(this, NotificationCenter.fileLoaded);
        org.telegram.ui.Cells.u0 u0Var = this.L;
        if (u0Var != null) {
            HashMap hashMap = (HashMap) u0Var.f25724f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.L = null;
        }
        kh.d0 d0Var = this.D;
        if (d0Var != null) {
            this.P = d0Var.getCurrentPosition();
            this.D.release(new lj0(20));
            this.D = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.I, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.I);
        }
        if (this.O != measuredWidth) {
            this.O = measuredWidth;
            f2.b bVar = this.M;
            if (bVar != null) {
                RectF rectF = (RectF) bVar.f5317c;
                ((Rect) bVar.f5318e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            v1 v1Var = this.J;
            if (v1Var != null) {
                RectF rectF2 = v1Var.f50735c;
                RectF rectF3 = v1Var.f50733a;
                int i13 = this.v;
                if (i13 != 6 && i13 != 9 && i13 != 3 && i13 != 7 && i13 != 24 && i13 != 43 && i13 != 11 && i13 != 4) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    v1Var.f50734b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                }
                v1Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            t1 t1Var = this.K;
            if (t1Var != null) {
                RectF rectF5 = t1Var.f50699a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                t1Var.f50700b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = t1Var.f50702e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((s1) arrayList.get(i14)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.u0 u0Var = this.L;
            if (u0Var != null) {
                ((RectF) u0Var.f25725g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.L.f25725g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.L.f25722c;
                System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    ((l) arrayList2.get(i15)).a(i15, true);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f10 = size;
        float f11 = (f10 - (0.671f * min)) / 2.0f;
        this.I = 0.0671f * min;
        x1 x1Var = this.E;
        x1Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f11, 0.0f, f10 - f11, min);
        } else {
            float f12 = size2;
            AndroidUtilities.rectTmp.set(f11, f12 - min, f10 - f11, f12);
        }
        ViewGroup.LayoutParams layoutParams = x1Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        x1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) x1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) x1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i9, i10);
    }

    @Override
    public void setOffset(float f10) {
        boolean z10;
        boolean z11 = this.d;
        boolean z12 = false;
        if (f10 < 0.0f) {
            float measuredWidth = (-f10) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.C = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth < 0.1f) {
                z12 = true;
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
            if (measuredWidth2 > -0.1f) {
                z12 = true;
            }
            this.C = Math.abs(measuredWidth2);
        }
        if (z10 != this.f50811w) {
            this.f50811w = z10;
            c();
        }
        if (z12 != this.A) {
            this.A = z12;
            ImageReceiver imageReceiver = this.f50808n;
            imageReceiver.setAllowStartAnimation(z12);
            if (this.A) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            kh.d0 d0Var = this.D;
            if (d0Var != null) {
                this.P = d0Var.getCurrentPosition();
                this.D.release(new lj0(20));
                this.D = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
