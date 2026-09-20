package rg;

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
import org.telegram.ui.u21;
public final class z1 extends FrameLayout implements l0, NotificationCenter.NotificationCenterDelegate {
    public static final float[] U = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    public boolean E;
    public boolean F;
    public float G;
    public ci.c0 H;
    public final x1 I;
    public final TextureView J;
    public final j0.a K;
    public final org.telegram.ui.Components.voip.g L;
    public float M;
    public final v1 N;
    public final t1 O;
    public org.telegram.ui.Cells.u0 P;
    public final ra.a Q;
    public final TLRPC.Document R;
    public int S;
    public long T;
    public final SvgHelper.SvgDrawable f42865a;
    public final Paint f42866b;
    public final Paint f42867c;
    public final boolean d;
    public File e;
    public float f42868f;
    public final String h;
    public final ImageReceiver f42869n;
    public q1 f42870r;
    public final int f42871s;
    public final int v;
    public boolean f42872w;
    public boolean f42873x;
    public boolean f42874y;

    public z1(android.content.Context r18, org.telegram.messenger.SvgHelper.SvgDrawable r19, int r20, int r21, org.telegram.ui.ActionBar.f6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: rg.z1.<init>(android.content.Context, org.telegram.messenger.SvgHelper$SvgDrawable, int, int, org.telegram.ui.ActionBar.f6):void");
    }

    public final void a() {
        File file = this.e;
        if ((file != null && file.exists()) || SharedConfig.streamMedia) {
            File file2 = this.e;
            if (file2 != null && file2.exists()) {
                if ((NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & 512) != 0) {
                    q1 q1Var = this.f42870r;
                    if (q1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(q1Var);
                    }
                    q1 q1Var2 = new q1(this, 1);
                    this.f42870r = q1Var2;
                    AndroidUtilities.runOnUIThread(q1Var2, 300L);
                    return;
                }
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(ApplicationLoader.applicationContext, Uri.fromFile(this.e));
                    int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    mediaMetadataRetriever.release();
                    this.f42868f = parseInt / parseInt2;
                } catch (Exception unused) {
                    this.f42868f = 0.671f;
                }
            } else {
                this.f42868f = 0.671f;
            }
            if (this.E) {
                b();
            }
        }
        this.f42870r = null;
    }

    public final void b() {
        Uri uri;
        int i10 = this.f42871s;
        if ((this.e != null || SharedConfig.streamMedia) && this.H == null) {
            this.I.a(this.f42868f, 0);
            ci.c0 c0Var = new ci.c0(this, 1);
            this.H = c0Var;
            TextureView textureView = this.J;
            c0Var.with(textureView);
            File file = this.e;
            if (file != null && file.exists()) {
                uri = Uri.fromFile(this.e);
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder("?account=");
                    sb2.append(i10);
                    sb2.append("&id=");
                    sb2.append(this.R.f18334id);
                    sb2.append("&hash=");
                    sb2.append(this.R.access_hash);
                    sb2.append("&dc=");
                    sb2.append(this.R.dc_id);
                    sb2.append("&size=");
                    sb2.append(this.R.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(this.R.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(FileLoader.getInstance(i10).getFileReference(MediaDataController.getInstance(i10).getPremiumPromo()));
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(this.R), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr = this.R.file_reference;
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
            this.H.preparePlayer(uri, false, 1.0f);
            if (!this.F) {
                this.f42869n.stopAnimation();
                textureView.setAlpha(0.0f);
            }
            this.H.seekTo(this.T + 60);
            this.H.play();
        }
    }

    public final void c() {
        boolean z10;
        if (this.f42872w && this.f42873x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42874y != z10) {
            this.f42874y = z10;
            ImageReceiver imageReceiver = this.f42869n;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver.onDetachedFromWindow();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.h;
            if (str2 != null && str2.equals(str)) {
                this.e = (File) objArr[1];
                a();
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: rg.z1.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42873x = true;
        c();
        if (!this.F) {
            a();
        }
        NotificationCenter.getInstance(this.f42871s).addObserver(this, NotificationCenter.fileLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42873x = false;
        c();
        NotificationCenter.getInstance(this.f42871s).removeObserver(this, NotificationCenter.fileLoaded);
        org.telegram.ui.Cells.u0 u0Var = this.P;
        if (u0Var != null) {
            HashMap hashMap = (HashMap) u0Var.f21222f;
            for (Bitmap bitmap : hashMap.values()) {
                bitmap.recycle();
            }
            hashMap.clear();
            this.P = null;
        }
        ci.c0 c0Var = this.H;
        if (c0Var != null) {
            this.T = c0Var.getCurrentPosition();
            this.H.release(new u21(15));
            this.H = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float min = (int) (Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * min)) / 2.0f;
        if (this.d) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.M, getMeasuredWidth() - measuredWidth2, min);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - min, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.M);
        }
        if (this.S != measuredWidth) {
            this.S = measuredWidth;
            ra.a aVar = this.Q;
            if (aVar != null) {
                RectF rectF = (RectF) aVar.f42477c;
                ((Rect) aVar.e).set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rectF.set(AndroidUtilities.rectTmp);
                rectF.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            v1 v1Var = this.N;
            if (v1Var != null) {
                RectF rectF2 = v1Var.f42802c;
                RectF rectF3 = v1Var.f42800a;
                int i14 = this.v;
                if (i14 != 6 && i14 != 9 && i14 != 3 && i14 != 7 && i14 != 24 && i14 != 43 && i14 != 11 && i14 != 4) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float width = (int) (rectF4.width() * 0.4f);
                    rectF3.set(rectF4.centerX() - width, rectF4.centerY() - width, rectF4.centerX() + width, rectF4.centerY() + width);
                    v1Var.f42801b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    rectF3.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                }
                v1Var.f();
                rectF2.set(AndroidUtilities.rectTmp);
                rectF2.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            t1 t1Var = this.O;
            if (t1Var != null) {
                RectF rectF5 = t1Var.f42768a;
                rectF5.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                t1Var.f42769b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF5.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                rectF5.offset(0.0f, getMeasuredHeight() * 0.1f);
                ArrayList arrayList = t1Var.e;
                long currentTimeMillis = System.currentTimeMillis();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((s1) arrayList.get(i15)).a(currentTimeMillis, true);
                }
            }
            org.telegram.ui.Cells.u0 u0Var = this.P;
            if (u0Var != null) {
                ((RectF) u0Var.f21223g).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.h).set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((RectF) this.P.f21223g).inset(AndroidUtilities.dp(0.0f), getMeasuredHeight() * 0.1f);
                ArrayList arrayList2 = this.P.f21221c;
                System.currentTimeMillis();
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    ((l) arrayList2.get(i16)).a(i16, true);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = (int) (Math.min(size2, size) * 0.9f);
        float f7 = size;
        float f10 = (f7 - (0.671f * min)) / 2.0f;
        this.M = 0.0671f * min;
        x1 x1Var = this.I;
        x1Var.invalidateOutline();
        if (this.d) {
            AndroidUtilities.rectTmp.set(f10, 0.0f, f7 - f10, min);
        } else {
            float f11 = size2;
            AndroidUtilities.rectTmp.set(f10, f11 - min, f7 - f10, f11);
        }
        ViewGroup.LayoutParams layoutParams = x1Var.getLayoutParams();
        RectF rectF = AndroidUtilities.rectTmp;
        layoutParams.width = (int) rectF.width();
        x1Var.getLayoutParams().height = (int) rectF.height();
        ((ViewGroup.MarginLayoutParams) x1Var.getLayoutParams()).leftMargin = (int) rectF.left;
        ((ViewGroup.MarginLayoutParams) x1Var.getLayoutParams()).topMargin = (int) rectF.top;
        super.onMeasure(i10, i11);
    }

    @Override
    public void setOffset(float f7) {
        boolean z10;
        boolean z11 = this.d;
        boolean z12 = false;
        if (f7 < 0.0f) {
            float measuredWidth = (-f7) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (z11) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.G = Math.abs(measuredWidth);
            if (measuredWidth < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth < 0.1f) {
                z12 = true;
            }
        } else {
            float measuredWidth2 = (-f7) / getMeasuredWidth();
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
            this.G = Math.abs(measuredWidth2);
        }
        if (z10 != this.f42872w) {
            this.f42872w = z10;
            c();
        }
        if (z12 != this.E) {
            this.E = z12;
            ImageReceiver imageReceiver = this.f42869n;
            imageReceiver.setAllowStartAnimation(z12);
            if (this.E) {
                imageReceiver.startAnimation();
                b();
                return;
            }
            ci.c0 c0Var = this.H;
            if (c0Var != null) {
                this.T = c0Var.getCurrentPosition();
                this.H.release(new u21(15));
                this.H = null;
            }
            imageReceiver.stopAnimation();
        }
    }
}
