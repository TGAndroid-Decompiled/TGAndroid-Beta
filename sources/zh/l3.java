package zh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.qq;
public final class l3 extends qq {
    public final Path f52189b;
    public final RectF f52190c;
    public final h8 d;
    public final int f52191e;
    public final View f52192f;
    public final ImageReceiver f52193g;
    public final org.telegram.ui.Components.o5 h;
    public RadialGradient f52194i;
    public final Matrix f52195j;
    public final f01 f52196k;
    public final f01 f52197l;
    public org.telegram.ui.Components.p6 f52198m;
    public final float f52199n;
    public yf.n f52200o;
    public int f52201p;
    public int f52202q;
    public final Paint f52203r;
    public int f52204s;
    public int f52205t;

    public l3(View view, TL_stars.StarGift starGift, int i10, float f7) {
        super(view);
        float f10;
        String formatPluralString;
        int i11;
        float f11;
        float f12;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f52189b = new Path();
        this.f52190c = new RectF();
        this.f52195j = new Matrix();
        this.f52203r = new Paint(1);
        this.f52204s = AndroidUtilities.dp(16.0f);
        this.f52205t = 0;
        this.f52192f = view;
        this.f52199n = f7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f52193g = imageReceiver;
        if (i10 > 180) {
            f10 = 24.0f;
        } else {
            f10 = 18.0f;
        }
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(view, AndroidUtilities.dp(f10), false);
        this.h = o5Var;
        this.f52191e = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i10;
            v7.Z0(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            f01 f01Var = new f01(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.f52196k = f01Var;
            f01Var.o(-1);
            float f14 = i10 - 30;
            f01Var.q(AndroidUtilities.dp(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            f01Var.a();
            f01Var.n(1);
            if (starGift.sold_out) {
                formatPluralString = LocaleController.getString(R.string.Gift2SoldOutTitle);
            } else {
                formatPluralString = LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]);
            }
            f01 f01Var2 = new f01(formatPluralString, 13.0f, null);
            this.f52197l = f01Var2;
            f01Var2.q(AndroidUtilities.dp(f14));
            f01Var2.a();
            f01Var2.n(1);
            h8 h8Var = new h8(1, 40);
            this.d = h8Var;
            float f15 = 0.45f * f13;
            h8Var.f(-AndroidUtilities.dp(f15), -AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(f13 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = h8Var.f51993c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PointF pointF = new PointF(AndroidUtilities.lerp(0, width, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, height, Utilities.fastRandom.nextFloat()));
            float floor = (float) Math.floor(dp / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i16 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i17 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance(PointF.class, i16, i17);
            for (int i18 = 0; i18 < i16; i18++) {
                for (int i19 = 0; i19 < i17; i19++) {
                    pointFArr[i18][i19] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    i11 = Utilities.fastRandom.nextInt(arrayList2.size() - 1);
                } else {
                    i11 = 0;
                }
                PointF pointF2 = (PointF) arrayList2.get(i11);
                int i20 = 0;
                while (true) {
                    if (i20 < 15) {
                        f11 = dp;
                        f12 = floor;
                        int i21 = i20;
                        double lerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f11;
                        double lerp2 = AndroidUtilities.lerp(0, 360, Utilities.fastRandom.nextFloat());
                        PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(lerp2)) * lerp) + pointF2.x), (float) ((Math.sin(Math.toRadians(lerp2)) * lerp) + pointF2.y));
                        int dp2 = AndroidUtilities.dp(15.0f) / 2;
                        float f16 = pointF3.x;
                        float f17 = dp2;
                        if (f16 >= f17 && f16 < width - dp2) {
                            float f18 = pointF3.y;
                            if (f18 >= f17 && f18 < height - dp2) {
                                int floor2 = (int) Math.floor(f16 / f12);
                                int floor3 = (int) Math.floor(pointF3.y / f12);
                                int max = Math.max(floor2 - 1, 0);
                                int min = Math.min(floor2 + 1, ceil);
                                int max2 = Math.max(floor3 - 1, 0);
                                int min2 = Math.min(floor3 + 1, ceil2);
                                while (max <= min) {
                                    int i22 = min;
                                    int i23 = max2;
                                    while (i23 <= min2) {
                                        int i24 = i23;
                                        PointF pointF4 = pointFArr[max][i24];
                                        int i25 = max2;
                                        if (pointF4 != null) {
                                            i14 = ceil;
                                            i15 = width;
                                            if (v7.z6.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
                                                break;
                                            }
                                        } else {
                                            i14 = ceil;
                                            i15 = width;
                                        }
                                        i23 = i24 + 1;
                                        max2 = i25;
                                        ceil = i14;
                                        width = i15;
                                    }
                                    max++;
                                    min = i22;
                                }
                                i12 = ceil;
                                i13 = width;
                                arrayList.add(pointF3);
                                pointFArr[(int) Math.floor(pointF3.x / f12)][(int) Math.floor(pointF3.y / f12)] = pointF3;
                                arrayList2.add(pointF3);
                                break;
                            }
                        }
                        i14 = ceil;
                        i15 = width;
                        i20 = i21 + 1;
                        floor = f12;
                        dp = f11;
                        ceil = i14;
                        width = i15;
                    } else {
                        f11 = dp;
                        f12 = floor;
                        i12 = ceil;
                        i13 = width;
                        arrayList2.remove(i11);
                        break;
                    }
                }
                floor = f12;
                dp = f11;
                ceil = i12;
                width = i13;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = h8Var.f51992b;
            int size2 = size - arrayList3.size();
            for (int i26 = 0; i26 < size2; i26++) {
                arrayList3.add(new g8(h8Var));
            }
            int size3 = arrayList.size();
            h8Var.f51998j = size3;
            if (h8Var.f52000l != null) {
                e0.i0 i0Var = new e0.i0(size3);
                h8Var.f52000l = i0Var;
                Bitmap bitmap = h8Var.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i27 = 0;
                while (i27 < i0Var.f8625a) {
                    int i28 = i27;
                    e0.i0.a((float[]) i0Var.f8627c, i28, 0.0f, 0.0f, width2, height2);
                    i27 = i28 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i29 = 0; i29 < h8Var.f51998j; i29++) {
                g8 g8Var = (g8) arrayList3.get(i29);
                PointF pointF5 = (PointF) arrayList.get(i29);
                h8Var.c(g8Var, currentTimeMillis, true);
                g8Var.f51961a = pointF5.x + rectF.left;
                g8Var.f51962b = pointF5.y + rectF.top;
                g8Var.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                g8Var.f51964e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) s5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) s5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                o5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f52194i = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                o5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                v7.Z0(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        this.f29797a.setShader(this.f52194i);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.h.a();
        this.f52193g.onAttachedToWindow();
        if (this.f52200o != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i10 = this.f52202q;
            if (currentTime >= i10) {
                i10 = this.f52201p;
            }
            this.f52200o.a(i10 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.h.b();
        this.f52193g.onDetachedFromWindow();
        yf.n nVar = this.f52200o;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final void c(int i10) {
        f01 f01Var = this.f52197l;
        if (f01Var != null) {
            f01Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        int i12;
        this.f52202q = i10;
        this.f52201p = i11;
        if (this.f52200o == null) {
            this.f52200o = new yf.n(new rg.p2(this, 21));
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (currentTime < i10) {
            i12 = i10 - currentTime;
        } else {
            i12 = i11 - currentTime;
        }
        this.f52200o.a(i12);
        if (this.f52198m == null) {
            org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false, false);
            this.f52198m = p6Var;
            p6Var.r(-1);
            this.f52198m.t(AndroidUtilities.dp(12.0f));
            this.f52198m.setCallback(new ah.g1(this, 10));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        f01 f01Var;
        Rect bounds = getBounds();
        RectF rectF = this.f52190c;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f52189b;
        path.rewind();
        float f7 = this.f52204s;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        RadialGradient radialGradient = this.f52194i;
        Paint paint = this.f29797a;
        if (radialGradient != null) {
            Matrix matrix = this.f52195j;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f52194i.setLocalMatrix(matrix);
            paint.setShader(this.f52194i);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        j0.a(canvas, this.f52205t, this.h, rectF.width(), rectF.height(), 1.0f, this.f52199n);
        h8 h8Var = this.d;
        if (h8Var != null) {
            h8Var.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        f01 f01Var2 = this.f52196k;
        ImageReceiver imageReceiver = this.f52193g;
        if (f01Var2 != null && (f01Var = this.f52197l) != null) {
            if (this.f52198m != null) {
                Paint paint2 = this.f52203r;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.f52198m.d(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.f52198m.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.draw(canvas);
            f01Var2.e(canvas, rectF.centerX() - (f01Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            f01Var.e(canvas, rectF.centerX() - (f01Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f10 = min2 / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f10, rectF.centerY() - f10, min2, min2);
            imageReceiver.draw(canvas);
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.f52191e) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f52194i = radialGradient;
        this.f29797a.setShader(radialGradient);
    }

    public final void f() {
        this.f52205t = 3;
    }

    public final void g(int i10) {
        this.f52204s = i10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f52191e);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f52191e);
    }

    public final void h() {
        f01 f01Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i10 = this.f52201p;
        if (currentTime > i10) {
            this.f52198m.q(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i11 = this.f52202q;
            if (currentTime < i11) {
                this.f52198m.q(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i11 - currentTime, true)), true, true);
            } else {
                this.f52198m.q(AndroidUtilities.formatDuration(i10 - currentTime, true), true, true);
            }
        }
        if (currentTime > this.f52201p && (f01Var = this.f52197l) != null) {
            f01Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
        }
    }
}
