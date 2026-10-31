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
public final class y40 extends FrameLayout {
    public final RectF D;
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final b50 K;
    public final org.telegram.ui.Components.ei0 f43696a;
    public final TextView f43697b;
    public final TLRPC.GroupCallParticipant f43698c;
    public final org.telegram.ui.Components.bi0 d;
    public boolean e;
    public float f43699f;
    public float h;
    public int f43700n;
    public double f43701r;
    public final Paint f43702s;
    public final Paint f43703w;
    public final Path f43704x;
    public final float[] f43705y;

    public y40(b50 b50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i10;
        int i11;
        int L;
        int i12;
        int i13;
        this.K = b50Var;
        this.f43702s = new Paint(1);
        Paint paint = new Paint(1);
        this.f43703w = paint;
        this.f43704x = new Path();
        this.f43705y = new float[8];
        this.D = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.f43698c = groupCallParticipant;
        this.f43701r = org.telegram.messenger.w3.H(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624202, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        this.d = bi0Var;
        ?? imageView = new ImageView(context);
        this.f43696a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(bi0Var);
        if (this.f43701r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView((View) imageView, w7.b6.d(-2, 40.0f, i10 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f43701r == 0.0d) {
            i11 = 17;
        } else {
            i11 = 34;
        }
        bi0Var.P(i11);
        bi0Var.N(bi0Var.f24759f - 1, false, true);
        TextView textView = new TextView(context);
        this.f43697b = textView;
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
        if (org.telegram.messenger.cd.X) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(43.0f);
        }
        if (org.telegram.messenger.cd.X) {
            i12 = org.telegram.messenger.i0.L(43.0f);
        } else {
            i12 = 0;
        }
        textView.setPadding(L, 0, i12, 0);
        addView(textView, w7.b6.e(-2, -2, (org.telegram.messenger.cd.X ? 5 : 3) | 16));
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
        b50 b50Var = this.K;
        org.telegram.messenger.c cVar = b50Var.f36036k1;
        if (VoIPService.getSharedInstance() != null) {
            this.f43701r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f43698c;
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
            this.f43697b.setText(((int) d10) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z10) {
                long C1 = org.telegram.messenger.jj.C1(groupCallParticipant.peer);
                if (C1 > 0) {
                    L0 = org.telegram.messenger.vp.r1(cVar.f14863a).Z1(Long.valueOf(C1));
                } else {
                    L0 = org.telegram.messenger.vp.r1(cVar.f14863a).L0(Long.valueOf(-C1));
                }
                TLObject tLObject = L0;
                if (groupCallParticipant.volume == 0) {
                    c40 c40Var = b50Var.W4;
                    if (c40Var != null) {
                        c40Var.dismiss();
                        b50Var.W4 = null;
                    }
                    b50Var.f1(true);
                    if (b50Var.S0()) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                    b50Var.z1(groupCallParticipant, C1, i11);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f43701r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.ei0 ei0Var = this.f43696a;
            if ((ei0Var.getTag() == null && num != null) || (ei0Var.getTag() != null && num == null)) {
                if (this.f43701r == 0.0d) {
                    i10 = 17;
                } else {
                    i10 = 34;
                }
                org.telegram.ui.Components.bi0 bi0Var = this.d;
                bi0Var.P(i10);
                if (this.f43701r != 0.0d) {
                    i12 = 17;
                }
                bi0Var.M(i12);
                bi0Var.start();
                ei0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43699f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f43699f) > viewConfiguration.getScaledTouchSlop()) {
                        this.e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f43700n = x10;
                            if (x10 < 0) {
                                this.f43700n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f43700n = getMeasuredWidth();
                            }
                            this.J = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.J) {
                    int x11 = (int) motionEvent.getX();
                    this.f43700n = x11;
                    if (x11 < 0) {
                        this.f43700n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f43700n = getMeasuredWidth();
                    }
                    a(this.f43700n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f43700n = x12;
                    if (x12 < 0) {
                        this.f43700n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f43700n = getMeasuredWidth();
                    }
                    this.J = true;
                }
            }
            if (this.J) {
                if (motionEvent.getAction() == 1) {
                    a(this.f43700n / getMeasuredWidth(), true);
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
        y40 y40Var = this;
        int i13 = y40Var.E;
        double d = y40Var.f43701r;
        if (d < 0.25d) {
            y40Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            y40Var.E = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            y40Var.E = -11027349;
        } else {
            y40Var.E = -11688225;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (i13 == 0) {
            i10 = y40Var.E;
            y40Var.G = 1.0f;
        } else {
            int S0 = org.telegram.messenger.i0.S0(y40Var.G, 1.0f, y40Var.F, i13);
            if (i13 != y40Var.E) {
                y40Var.G = 0.0f;
                y40Var.F = S0;
            }
            i10 = S0;
        }
        Paint paint = y40Var.f43702s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - y40Var.H;
        if (j10 > 17) {
            j10 = 17;
        }
        y40Var.H = elapsedRealtime;
        float f13 = y40Var.G;
        if (f13 < 1.0f) {
            float f14 = (((float) j10) / 200.0f) + f13;
            y40Var.G = f14;
            if (f14 > 1.0f) {
                y40Var.G = 1.0f;
            } else {
                y40Var.invalidate();
            }
        }
        Path path = y40Var.f43704x;
        path.reset();
        float f15 = 6.0f;
        float L2 = org.telegram.messenger.i0.L(6.0f);
        float[] fArr = y40Var.f43705y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i14 = 1;
        fArr[1] = L2;
        int i15 = 0;
        fArr[0] = L2;
        if (y40Var.f43700n < org.telegram.messenger.i0.L(12.0f)) {
            f7 = Math.max(0.0f, (y40Var.f43700n - org.telegram.messenger.i0.L(6.0f)) / org.telegram.messenger.i0.L(6.0f));
        } else {
            f7 = 1.0f;
        }
        float L3 = org.telegram.messenger.i0.L(6.0f) * f7;
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        RectF rectF = y40Var.D;
        rectF.set(0.0f, 0.0f, y40Var.f43700n, y40Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (org.telegram.messenger.w3.H(y40Var.f43698c) / 100.0d);
        org.telegram.ui.Components.ei0 ei0Var = y40Var.f43696a;
        int L4 = org.telegram.messenger.i0.L(5.0f) + (ei0Var.getMeasuredWidth() / 2) + ei0Var.getLeft();
        int measuredHeight = (ei0Var.getMeasuredHeight() / 2) + ei0Var.getTop();
        int i16 = 0;
        while (true) {
            float[] fArr2 = y40Var.I;
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
                Paint paint2 = y40Var.f43703w;
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
                y40Var = this;
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
        this.f43700n = (int) (View.MeasureSpec.getSize(i10) * this.f43701r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
