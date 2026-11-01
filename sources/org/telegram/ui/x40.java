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
public final class x40 extends FrameLayout {
    public final RectF D;
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final a50 K;
    public final org.telegram.ui.Components.fi0 f43227a;
    public final TextView f43228b;
    public final TLRPC.GroupCallParticipant f43229c;
    public final org.telegram.ui.Components.ci0 d;
    public boolean e;
    public float f43230f;
    public float h;
    public int f43231n;
    public double f43232r;
    public final Paint f43233s;
    public final Paint f43234w;
    public final Path f43235x;
    public final float[] f43236y;

    public x40(a50 a50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        this.K = a50Var;
        this.f43233s = new Paint(1);
        Paint paint = new Paint(1);
        this.f43234w = paint;
        this.f43235x = new Path();
        this.f43236y = new float[8];
        this.D = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.f43229c = groupCallParticipant;
        this.f43232r = org.telegram.messenger.w3.H(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624202, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        this.d = ci0Var;
        ?? imageView = new ImageView(context);
        this.f43227a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ci0Var);
        if (this.f43232r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView((View) imageView, w7.b6.d(-2, 40.0f, i10 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f43232r == 0.0d) {
            i11 = 17;
        } else {
            i11 = 34;
        }
        ci0Var.P(i11);
        ci0Var.N(ci0Var.f25138f - 1, false, true);
        TextView textView = new TextView(context);
        this.f43228b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Vg, null);
        textView.setTextSize(1, 16.0f);
        double H = org.telegram.messenger.w3.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        double max = H > 0.0d ? Math.max(H, 1.0d) : 0.0d;
        textView.setText(((int) max) + "%");
        if (org.telegram.messenger.dd.X) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(43.0f);
        }
        if (org.telegram.messenger.dd.X) {
            i12 = org.telegram.messenger.i0.L(43.0f);
        } else {
            i12 = 0;
        }
        textView.setPadding(L, 0, i12, 0);
        addView(textView, w7.b6.e(-2, -2, (org.telegram.messenger.dd.X ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int H2 = (int) (org.telegram.messenger.w3.H(groupCallParticipant) / 100.0d);
        int i14 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i14 < fArr.length) {
                if (i14 == 0) {
                    i13 = 0;
                } else if (i14 == 1) {
                    i13 = 50;
                } else {
                    i13 = 150;
                }
                if (H2 > i13) {
                    fArr[i14] = 1.0f;
                } else {
                    fArr[i14] = 0.0f;
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z10) {
        double d10;
        int i10;
        TLObject L0;
        int i11;
        a50 a50Var = this.K;
        org.telegram.messenger.c cVar = a50Var.f35620k1;
        if (VoIPService.getSharedInstance() != null) {
            this.f43232r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f43229c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i12 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double H = org.telegram.messenger.w3.H(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (H > 0.0d) {
                d10 = Math.max(H, 1.0d);
            } else {
                d10 = 0.0d;
            }
            this.f43228b.setText(((int) d10) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z10) {
                long C1 = org.telegram.messenger.kj.C1(groupCallParticipant.peer);
                if (C1 > 0) {
                    L0 = org.telegram.messenger.wp.r1(cVar.f15043a).Z1(Long.valueOf(C1));
                } else {
                    L0 = org.telegram.messenger.wp.r1(cVar.f15043a).L0(Long.valueOf(-C1));
                }
                TLObject tLObject = L0;
                if (groupCallParticipant.volume == 0) {
                    b40 b40Var = a50Var.W4;
                    if (b40Var != null) {
                        b40Var.dismiss();
                        a50Var.W4 = null;
                    }
                    a50Var.f1(true);
                    if (a50Var.S0()) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                    a50Var.z1(groupCallParticipant, C1, i11);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f43232r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.fi0 fi0Var = this.f43227a;
            if ((fi0Var.getTag() == null && num != null) || (fi0Var.getTag() != null && num == null)) {
                if (this.f43232r == 0.0d) {
                    i10 = 17;
                } else {
                    i10 = 34;
                }
                org.telegram.ui.Components.ci0 ci0Var = this.d;
                ci0Var.P(i10);
                if (this.f43232r != 0.0d) {
                    i12 = 17;
                }
                ci0Var.M(i12);
                ci0Var.start();
                fi0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43230f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f43230f) > viewConfiguration.getScaledTouchSlop()) {
                        this.e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f43231n = x10;
                            if (x10 < 0) {
                                this.f43231n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f43231n = getMeasuredWidth();
                            }
                            this.J = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.J) {
                    int x11 = (int) motionEvent.getX();
                    this.f43231n = x11;
                    if (x11 < 0) {
                        this.f43231n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f43231n = getMeasuredWidth();
                    }
                    a(this.f43231n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f43231n = x12;
                    if (x12 < 0) {
                        this.f43231n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f43231n = getMeasuredWidth();
                    }
                    this.J = true;
                }
            }
            if (this.J) {
                if (motionEvent.getAction() == 1) {
                    a(this.f43231n / getMeasuredWidth(), true);
                }
                this.J = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float L;
        int i11;
        float f10;
        int i12;
        x40 x40Var = this;
        int i13 = x40Var.E;
        double d = x40Var.f43232r;
        if (d < 0.25d) {
            x40Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            x40Var.E = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            x40Var.E = -11027349;
        } else {
            x40Var.E = -11688225;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (i13 == 0) {
            i10 = x40Var.E;
            x40Var.G = 1.0f;
        } else {
            int S0 = org.telegram.messenger.i0.S0(x40Var.G, 1.0f, x40Var.F, i13);
            if (i13 != x40Var.E) {
                x40Var.G = 0.0f;
                x40Var.F = S0;
            }
            i10 = S0;
        }
        Paint paint = x40Var.f43233s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - x40Var.H;
        if (j10 > 17) {
            j10 = 17;
        }
        x40Var.H = elapsedRealtime;
        float f13 = x40Var.G;
        if (f13 < 1.0f) {
            float f14 = (((float) j10) / 200.0f) + f13;
            x40Var.G = f14;
            if (f14 > 1.0f) {
                x40Var.G = 1.0f;
            } else {
                x40Var.invalidate();
            }
        }
        Path path = x40Var.f43235x;
        path.reset();
        float f15 = 6.0f;
        float L2 = org.telegram.messenger.i0.L(6.0f);
        float[] fArr = x40Var.f43236y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i14 = 1;
        fArr[1] = L2;
        int i15 = 0;
        fArr[0] = L2;
        if (x40Var.f43231n < org.telegram.messenger.i0.L(12.0f)) {
            f7 = Math.max(0.0f, (x40Var.f43231n - org.telegram.messenger.i0.L(6.0f)) / org.telegram.messenger.i0.L(6.0f));
        } else {
            f7 = 1.0f;
        }
        float L3 = org.telegram.messenger.i0.L(6.0f) * f7;
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        RectF rectF = x40Var.D;
        rectF.set(0.0f, 0.0f, x40Var.f43231n, x40Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (org.telegram.messenger.w3.H(x40Var.f43229c) / 100.0d);
        org.telegram.ui.Components.fi0 fi0Var = x40Var.f43227a;
        int L4 = org.telegram.messenger.i0.L(5.0f) + (fi0Var.getMeasuredWidth() / 2) + fi0Var.getLeft();
        int measuredHeight = (fi0Var.getMeasuredHeight() / 2) + fi0Var.getTop();
        int i16 = 0;
        while (true) {
            float[] fArr2 = x40Var.I;
            if (i16 < fArr2.length) {
                if (i16 == 0) {
                    L = org.telegram.messenger.i0.L(f15);
                    f10 = f11;
                    i12 = i15;
                } else {
                    if (i16 == i14) {
                        L = org.telegram.messenger.i0.L(10.0f);
                        i11 = 50;
                    } else {
                        L = org.telegram.messenger.i0.L(14.0f);
                        i11 = 150;
                    }
                    f10 = f11;
                    i12 = i11;
                }
                float f16 = f12;
                float f17 = fArr2[i16];
                float L5 = (f16 - f17) * org.telegram.messenger.i0.L(2.0f);
                Paint paint2 = x40Var.f43234w;
                paint2.setAlpha((int) (255.0f * f17));
                float f18 = L4;
                float f19 = measuredHeight;
                rectF.set((f18 - L) + L5, (f19 - L) + L5, (f18 + L) - L5, (f19 + L) - L5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (H > i12) {
                    float f20 = fArr2[i16];
                    if (f20 < f16) {
                        float f21 = (((float) j10) / 180.0f) + f20;
                        fArr2[i16] = f21;
                        if (f21 > f16) {
                            fArr2[i16] = f16;
                        }
                        invalidate();
                    }
                } else {
                    float f22 = fArr2[i16];
                    if (f22 > f10) {
                        float f23 = f22 - (((float) j10) / 180.0f);
                        fArr2[i16] = f23;
                        if (f23 < f10) {
                            fArr2[i16] = f10;
                        }
                        invalidate();
                    }
                }
                i16++;
                x40Var = this;
                canvas2 = canvas;
                f11 = f10;
                f12 = f16;
                f15 = 6.0f;
                i14 = 1;
                i15 = 0;
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
        this.f43231n = (int) (View.MeasureSpec.getSize(i10) * this.f43232r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
