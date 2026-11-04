package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u30 extends FrameLayout {
    public final RectF E;
    public int F;
    public int G;
    public float H;
    public long I;
    public final float[] J;
    public boolean K;
    public final x30 L;
    public final org.telegram.ui.Components.fh0 f49960a;
    public final TextView f49961b;
    public final TLRPC.GroupCallParticipant f49962c;
    public final org.telegram.ui.Components.ch0 d;
    public boolean f49963e;
    public float f49964f;
    public float h;
    public int f49965n;
    public double f49966r;
    public final Paint f49967s;
    public final Paint f49968w;
    public final Path f49969x;
    public final float[] f49970y;

    public u30(x30 x30Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i3;
        int i10;
        int L;
        int i11;
        int i12;
        this.L = x30Var;
        this.f49967s = new Paint(1);
        Paint paint = new Paint(1);
        this.f49968w = paint;
        this.f49969x = new Path();
        this.f49970y = new float[8];
        this.E = new RectF();
        this.J = new float[3];
        setWillNotDraw(false);
        this.f49962c = groupCallParticipant;
        this.f49966r = org.telegram.messenger.t3.H(groupCallParticipant) / 20000.0f;
        this.H = 1.0f;
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624204, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.d = ch0Var;
        ?? imageView = new ImageView(context);
        this.f49960a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ch0Var);
        if (this.f49966r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView((View) imageView, b8.mf.d(-2, 40.0f, i3 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f49966r == 0.0d) {
            i10 = 17;
        } else {
            i10 = 34;
        }
        ch0Var.P(i10);
        ch0Var.N(ch0Var.f32727f - 1, false, true);
        TextView textView = new TextView(context);
        this.f49961b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Vg, null);
        textView.setTextSize(1, 16.0f);
        double H = org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        double max = H > 0.0d ? Math.max(H, 1.0d) : 0.0d;
        textView.setText(((int) max) + "%");
        if (org.telegram.messenger.bd.f21784a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(43.0f);
        }
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i11 = 0;
        }
        textView.setPadding(L, 0, i11, 0);
        addView(textView, b8.mf.e(-2, -2, (org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int H2 = (int) (org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d);
        int i13 = 0;
        while (true) {
            float[] fArr = this.J;
            if (i13 < fArr.length) {
                if (i13 == 0) {
                    i12 = 0;
                } else if (i13 == 1) {
                    i12 = 50;
                } else {
                    i12 = 150;
                }
                if (H2 > i12) {
                    fArr[i13] = 1.0f;
                } else {
                    fArr[i13] = 0.0f;
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z10) {
        double d10;
        int i3;
        TLObject M0;
        int i10;
        x30 x30Var = this.L;
        org.telegram.messenger.c cVar = x30Var.f51759l1;
        if (VoIPService.getSharedInstance() != null) {
            this.f49966r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f49962c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i11 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double H = org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (H > 0.0d) {
                d10 = Math.max(H, 1.0d);
            } else {
                d10 = 0.0d;
            }
            this.f49961b.setText(((int) d10) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z10) {
                long C1 = org.telegram.messenger.zi.C1(groupCallParticipant.peer);
                if (C1 > 0) {
                    M0 = org.telegram.messenger.hp.s1(cVar.f21919a).a2(Long.valueOf(C1));
                } else {
                    M0 = org.telegram.messenger.hp.s1(cVar.f21919a).M0(Long.valueOf(-C1));
                }
                TLObject tLObject = M0;
                if (groupCallParticipant.volume == 0) {
                    z20 z20Var = x30Var.X4;
                    if (z20Var != null) {
                        z20Var.dismiss();
                        x30Var.X4 = null;
                    }
                    x30Var.f1(true);
                    if (x30Var.S0()) {
                        i10 = 0;
                    } else {
                        i10 = 5;
                    }
                    x30Var.z1(groupCallParticipant, C1, i10);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f49966r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.fh0 fh0Var = this.f49960a;
            if ((fh0Var.getTag() == null && num != null) || (fh0Var.getTag() != null && num == null)) {
                if (this.f49966r == 0.0d) {
                    i3 = 17;
                } else {
                    i3 = 34;
                }
                org.telegram.ui.Components.ch0 ch0Var = this.d;
                ch0Var.P(i3);
                if (this.f49966r != 0.0d) {
                    i11 = 17;
                }
                ch0Var.M(i11);
                ch0Var.start();
                fh0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f49964f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f49963e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f49964f) > viewConfiguration.getScaledTouchSlop()) {
                        this.f49963e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f49965n = x10;
                            if (x10 < 0) {
                                this.f49965n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f49965n = getMeasuredWidth();
                            }
                            this.K = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.K) {
                    int x11 = (int) motionEvent.getX();
                    this.f49965n = x11;
                    if (x11 < 0) {
                        this.f49965n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f49965n = getMeasuredWidth();
                    }
                    a(this.f49965n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.f49963e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f49965n = x12;
                    if (x12 < 0) {
                        this.f49965n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f49965n = getMeasuredWidth();
                    }
                    this.K = true;
                }
            }
            if (this.K) {
                if (motionEvent.getAction() == 1) {
                    a(this.f49965n / getMeasuredWidth(), true);
                }
                this.K = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        float L;
        int i10;
        float f11;
        int i11;
        u30 u30Var = this;
        int i12 = u30Var.F;
        double d = u30Var.f49966r;
        if (d < 0.25d) {
            u30Var.F = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            u30Var.F = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            u30Var.F = -11027349;
        } else {
            u30Var.F = -11688225;
        }
        float f12 = 0.0f;
        float f13 = 1.0f;
        if (i12 == 0) {
            i3 = u30Var.F;
            u30Var.H = 1.0f;
        } else {
            int S0 = org.telegram.messenger.g0.S0(u30Var.H, 1.0f, u30Var.G, i12);
            if (i12 != u30Var.F) {
                u30Var.H = 0.0f;
                u30Var.G = S0;
            }
            i3 = S0;
        }
        Paint paint = u30Var.f49967s;
        paint.setColor(i3);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - u30Var.I;
        if (j10 > 17) {
            j10 = 17;
        }
        u30Var.I = elapsedRealtime;
        float f14 = u30Var.H;
        if (f14 < 1.0f) {
            float f15 = (((float) j10) / 200.0f) + f14;
            u30Var.H = f15;
            if (f15 > 1.0f) {
                u30Var.H = 1.0f;
            } else {
                u30Var.invalidate();
            }
        }
        Path path = u30Var.f49969x;
        path.reset();
        float f16 = 6.0f;
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float[] fArr = u30Var.f49970y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i13 = 1;
        fArr[1] = L2;
        int i14 = 0;
        fArr[0] = L2;
        if (u30Var.f49965n < org.telegram.messenger.g0.L(12.0f)) {
            f10 = Math.max(0.0f, (u30Var.f49965n - org.telegram.messenger.g0.L(6.0f)) / org.telegram.messenger.g0.L(6.0f));
        } else {
            f10 = 1.0f;
        }
        float L3 = org.telegram.messenger.g0.L(6.0f) * f10;
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        RectF rectF = u30Var.E;
        rectF.set(0.0f, 0.0f, u30Var.f49965n, u30Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (org.telegram.messenger.t3.H(u30Var.f49962c) / 100.0d);
        org.telegram.ui.Components.fh0 fh0Var = u30Var.f49960a;
        int L4 = org.telegram.messenger.g0.L(5.0f) + (fh0Var.getMeasuredWidth() / 2) + fh0Var.getLeft();
        int measuredHeight = (fh0Var.getMeasuredHeight() / 2) + fh0Var.getTop();
        int i15 = 0;
        while (true) {
            float[] fArr2 = u30Var.J;
            if (i15 < fArr2.length) {
                if (i15 == 0) {
                    L = org.telegram.messenger.g0.L(f16);
                    f11 = f12;
                    i11 = i14;
                } else {
                    if (i15 == i13) {
                        L = org.telegram.messenger.g0.L(10.0f);
                        i10 = 50;
                    } else {
                        L = org.telegram.messenger.g0.L(14.0f);
                        i10 = 150;
                    }
                    f11 = f12;
                    i11 = i10;
                }
                float f17 = f13;
                float f18 = fArr2[i15];
                float L5 = (f17 - f18) * org.telegram.messenger.g0.L(2.0f);
                Paint paint2 = u30Var.f49968w;
                paint2.setAlpha((int) (255.0f * f18));
                float f19 = L4;
                float f20 = measuredHeight;
                rectF.set((f19 - L) + L5, (f20 - L) + L5, (f19 + L) - L5, (f20 + L) - L5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (H > i11) {
                    float f21 = fArr2[i15];
                    if (f21 < f17) {
                        float f22 = (((float) j10) / 180.0f) + f21;
                        fArr2[i15] = f22;
                        if (f22 > f17) {
                            fArr2[i15] = f17;
                        }
                        invalidate();
                    }
                } else {
                    float f23 = fArr2[i15];
                    if (f23 > f11) {
                        float f24 = f23 - (((float) j10) / 180.0f);
                        fArr2[i15] = f24;
                        if (f24 < f11) {
                            fArr2[i15] = f11;
                        }
                        invalidate();
                    }
                }
                i15++;
                u30Var = this;
                canvas2 = canvas;
                f12 = f11;
                f13 = f17;
                f16 = 6.0f;
                i13 = 1;
                i14 = 0;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
        this.f49965n = (int) (View.MeasureSpec.getSize(i3) * this.f49966r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
