package rh;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.rz0;
public final class p3 extends gq {
    public org.telegram.ui.Components.e6 D;
    public final float E;
    public rf.m F;
    public int G;
    public int H;
    public final Paint I;
    public int J;
    public int K;
    public final Path f47321c;
    public final RectF d;
    public final s8 e;
    public final int f47322f;
    public final View h;
    public final ImageReceiver f47323n;
    public final org.telegram.ui.Components.d5 f47324r;
    public RadialGradient f47325s;
    public final Matrix f47326w;
    public final rz0 f47327x;
    public final rz0 f47328y;

    public p3(View view, TL_stars.StarGift starGift, int i10, float f7) {
        super(view);
        float f10;
        String G;
        int i11;
        float f11;
        float f12;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f47321c = new Path();
        this.d = new RectF();
        this.f47326w = new Matrix();
        this.I = new Paint(1);
        this.J = org.telegram.messenger.i0.L(16.0f);
        this.K = 0;
        this.h = view;
        this.E = f7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f47323n = imageReceiver;
        if (i10 > 180) {
            f10 = 24.0f;
        } else {
            f10 = 18.0f;
        }
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(f10), view, false);
        this.f47324r = d5Var;
        this.f47322f = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i10;
            h8.c1(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            rz0 rz0Var = new rz0(str == null ? "Gift" : str, 16.0f, org.telegram.messenger.i0.o());
            this.f47327x = rz0Var;
            rz0Var.n(-1);
            float f14 = i10 - 30;
            rz0Var.p(org.telegram.messenger.i0.L(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            rz0Var.a();
            rz0Var.m(1);
            if (starGift.sold_out) {
                G = dd.L0(2131749976, null);
            } else {
                G = dd.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]);
            }
            rz0 rz0Var2 = new rz0(G, 13.0f, null);
            this.f47328y = rz0Var2;
            rz0Var2.p(org.telegram.messenger.i0.L(f14));
            rz0Var2.a();
            rz0Var2.m(1);
            s8 s8Var = new s8(1, 40);
            this.e = s8Var;
            float f15 = 0.45f * f13;
            s8Var.f(-org.telegram.messenger.i0.L(f15), -org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f13 * 0.25f));
            float L = org.telegram.messenger.i0.L(30.0f);
            RectF rectF = s8Var.f47472c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            d5.a aVar = Utilities.f14521c;
            PointF pointF = new PointF(org.telegram.messenger.i0.W1(aVar.nextFloat(), 0, width), org.telegram.messenger.i0.W1(aVar.nextFloat(), 0, height));
            int i16 = 1;
            int i17 = 0;
            float floor = (float) Math.floor(L / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i18 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i19 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance(PointF.class, i18, i19);
            for (int i20 = 0; i20 < i18; i20++) {
                for (int i21 = 0; i21 < i19; i21++) {
                    pointFArr[i20][i21] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int i22 = i16;
                if (arrayList2.size() > i22) {
                    i11 = Utilities.f14521c.nextInt(arrayList2.size() - i22);
                } else {
                    i11 = i17;
                }
                PointF pointF2 = (PointF) arrayList2.get(i11);
                int i23 = i17;
                while (true) {
                    if (i23 < 15) {
                        d5.a aVar2 = Utilities.f14521c;
                        f11 = L;
                        f12 = floor;
                        int i24 = i23;
                        double W1 = org.telegram.messenger.i0.W1(aVar2.nextFloat(), 1, 2) * f11;
                        PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(r13)) * W1) + pointF2.x), (float) ((Math.sin(Math.toRadians(r13)) * W1) + pointF2.y));
                        int L2 = org.telegram.messenger.i0.L(15.0f) / 2;
                        float f16 = pointF3.x;
                        float f17 = L2;
                        if (f16 >= f17 && f16 < width - L2) {
                            float f18 = pointF3.y;
                            if (f18 >= f17 && f18 < height - L2) {
                                int floor2 = (int) Math.floor(f16 / f12);
                                int floor3 = (int) Math.floor(pointF3.y / f12);
                                int max = Math.max(floor2 - 1, 0);
                                int min = Math.min(floor2 + 1, ceil);
                                int max2 = Math.max(floor3 - 1, 0);
                                int min2 = Math.min(floor3 + 1, ceil2);
                                while (max <= min) {
                                    int i25 = min;
                                    int i26 = max2;
                                    while (i26 <= min2) {
                                        int i27 = i26;
                                        PointF pointF4 = pointFArr[max][i27];
                                        int i28 = max2;
                                        if (pointF4 != null) {
                                            i14 = ceil;
                                            i15 = width;
                                            if (w7.z8.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
                                                break;
                                            }
                                        } else {
                                            i14 = ceil;
                                            i15 = width;
                                        }
                                        i26 = i27 + 1;
                                        max2 = i28;
                                        ceil = i14;
                                        width = i15;
                                    }
                                    max++;
                                    min = i25;
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
                        i23 = i24 + 1;
                        floor = f12;
                        L = f11;
                        ceil = i14;
                        width = i15;
                        i17 = 0;
                    } else {
                        f11 = L;
                        f12 = floor;
                        i12 = ceil;
                        i13 = width;
                        arrayList2.remove(i11);
                        break;
                    }
                }
                floor = f12;
                L = f11;
                ceil = i12;
                width = i13;
                i16 = 1;
                i17 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = s8Var.f47471b;
            int size2 = size - arrayList3.size();
            for (int i29 = 0; i29 < size2; i29++) {
                arrayList3.add(new r8(s8Var));
            }
            int size3 = arrayList.size();
            s8Var.f47476j = size3;
            if (s8Var.f47478l != null) {
                cc.f fVar = new cc.f(size3);
                s8Var.f47478l = fVar;
                Bitmap bitmap = s8Var.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i30 = 0;
                while (i30 < fVar.f4116b) {
                    int i31 = i30;
                    cc.f.a((float[]) fVar.d, i31, 0.0f, 0.0f, width2, height2);
                    i30 = i31 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i32 = 0; i32 < s8Var.f47476j; i32++) {
                r8 r8Var = (r8) arrayList3.get(i32);
                PointF pointF5 = (PointF) arrayList.get(i32);
                s8Var.c(r8Var, currentTimeMillis, true);
                r8Var.f47431a = pointF5.x + rectF.left;
                r8Var.f47432b = pointF5.y + rectF.top;
                r8Var.h = org.telegram.messenger.i0.T1(0.4f, 1.0f, Utilities.f14521c.nextFloat());
                r8Var.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e6.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e6.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) e6.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                d5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f47325s = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.N(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                d5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                h8.c1(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        ((Paint) this.f26519b).setShader(this.f47325s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.f47324r.a();
        this.f47323n.P();
        if (this.F != null) {
            int currentTime = ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime();
            int i10 = this.H;
            if (currentTime >= i10) {
                i10 = this.G;
            }
            this.F.a(i10 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.f47324r.b();
        this.f47323n.R();
        rf.m mVar = this.F;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void c(int i10) {
        rz0 rz0Var = this.f47328y;
        if (rz0Var != null) {
            rz0Var.n(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        int i12;
        this.H = i10;
        this.G = i11;
        if (this.F == null) {
            this.F = new rf.m(new d0(this, 2));
        }
        int currentTime = ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime();
        if (currentTime < i10) {
            i12 = i10 - currentTime;
        } else {
            i12 = i11 - currentTime;
        }
        this.F.a(i12);
        if (this.D == null) {
            org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
            this.D = e6Var;
            e6Var.u(-1);
            this.D.w(org.telegram.messenger.i0.L(12.0f));
            this.D.setCallback(new bi.s0(this, 8));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        rz0 rz0Var;
        Paint paint = (Paint) this.f26519b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f47321c;
        path.rewind();
        float f7 = this.J;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.f47325s != null) {
            Matrix matrix = this.f47326w;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f47325s.setLocalMatrix(matrix);
            paint.setShader(this.f47325s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        j0.a(canvas, this.K, this.f47324r, rectF.width(), rectF.height(), 1.0f, this.E);
        s8 s8Var = this.e;
        if (s8Var != null) {
            s8Var.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        rz0 rz0Var2 = this.f47327x;
        ImageReceiver imageReceiver = this.f47323n;
        if (rz0Var2 != null && (rz0Var = this.f47328y) != null) {
            if (this.D != null) {
                Paint paint2 = this.I;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f) + rectF.top, rectF.left + org.telegram.messenger.i0.L(20.0f) + Math.max(this.D.c(), org.telegram.messenger.i0.L(3.0f)), rectF.top + org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(8.5f), org.telegram.messenger.i0.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + org.telegram.messenger.i0.L(13.0f), rectF.top + org.telegram.messenger.i0.L(14.0f));
                this.D.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.y0(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.h(canvas, null);
            rz0Var2.e(canvas, rectF.centerX() - (rz0Var2.k() / 2.0f), rectF.bottom - org.telegram.messenger.i0.L(50.0f));
            rz0Var.e(canvas, rectF.centerX() - (rz0Var.k() / 2.0f), rectF.bottom - org.telegram.messenger.i0.L(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f10 = min2 / 2.0f;
            imageReceiver.y0(rectF.centerX() - f10, rectF.centerY() - f10, min2, min2);
            imageReceiver.h(canvas, null);
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.N(this.f47322f) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f47325s = radialGradient;
        ((Paint) this.f26519b).setShader(radialGradient);
    }

    public final void f() {
        this.K = 3;
    }

    public final void g(int i10) {
        this.J = i10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(this.f47322f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(this.f47322f);
    }

    public final void h() {
        rz0 rz0Var;
        int currentTime = ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime();
        int i10 = this.G;
        if (currentTime > i10) {
            this.D.t(dd.L0(2131750375, null), true, true);
        } else {
            int i11 = this.H;
            if (currentTime < i11) {
                this.D.t(dd.a0(null, null, 2131750374, org.telegram.messenger.i0.g0(i11 - currentTime, true, false)), true, true);
            } else {
                this.D.t(org.telegram.messenger.i0.g0(i10 - currentTime, true, false), true, true);
            }
        }
        if (currentTime > this.G && (rz0Var = this.f47328y) != null) {
            rz0Var.q(dd.L0(2131749976, null));
        }
    }
}
