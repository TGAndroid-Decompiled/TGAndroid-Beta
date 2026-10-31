package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class x7 extends s4.g0 {
    public final int f43459c;
    public final Object d;

    public x7(Object obj, int i10) {
        this.f43459c = i10;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i10, boolean z10) {
        int i11;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p5;
        org.telegram.messenger.hj hjVar;
        int lineTop2;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.gb;
            org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.f16385w2 != null) {
                    q1Var.P2(true);
                    org.telegram.messenger.vv vvVar = messageObject.f16385w2;
                    ArrayList arrayList2 = vvVar.f18996n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) vvVar.f18997o.get(size)).intValue();
                        if (i10 < intValue) {
                            size--;
                        } else {
                            Layout a2 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).a();
                            if (a2 != null) {
                                int lineForOffset = a2.getLineForOffset(Math.min(i10 - intValue, a2.getText().length()));
                                int y3 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).getY() + q1Var.f22724t0;
                                if (z10) {
                                    lineTop2 = a2.getLineBottom(lineForOffset);
                                } else {
                                    lineTop2 = a2.getLineTop(lineForOffset);
                                }
                                return y3 + lineTop2;
                            }
                        }
                    }
                } else if (messageObject.d1() == 0) {
                    if (!TextUtils.isEmpty(messageObject.f16394z) && (hjVar = q1Var.f22615k3) != null) {
                        i11 = (int) q1Var.f22701r3;
                        charSequence = messageObject.f16394z;
                        arrayList = hjVar.e;
                    } else {
                        q1Var.P2(true);
                        int i12 = q1Var.f22724t0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.f16397z2;
                        if (q1Var.f22725t1) {
                            i11 = org.telegram.messenger.m5.C(10.0f, q1Var.U1, i12);
                        } else {
                            i11 = i12;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i13);
                            StaticLayout staticLayout = gjVar.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i14 = gjVar.f15718n;
                            if (i10 > i14) {
                                if (i10 - i14 > charSequence3.length() - 1) {
                                    p5 = i11 + ((int) (gjVar.p(arrayList, x1Var) + gjVar.f15717f + gjVar.f15721w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i10 - gjVar.f15718n);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p5 = lineTop + gjVar.p(arrayList, x1Var) + i11 + gjVar.f15717f;
                                }
                                return (int) p5;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public final int b() {
        switch (this.f43459c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f23061e3.size();
            case 2:
                return ((org.telegram.ui.Components.l8) this.d).f28029e3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.lj ljVar = ((org.telegram.ui.Components.ua0) this.d).f30884r;
                if (ljVar == null) {
                    return 0;
                }
                return ljVar.f16749f.size();
            default:
                return ((sn0) this.d).f41612f.size();
        }
    }

    @Override
    public long c(int i10) {
        switch (this.f43459c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i10 / 12)) * 100) + (h8Var.J - (i10 % 12));
            case 1:
            default:
                return super.c(i10);
            case 2:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.d;
                if (i10 >= l8Var.f28029e3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.k8) l8Var.f28029e3.get(i10)).f27674a;
        }
    }

    @Override
    public int d(int i10) {
        switch (this.f43459c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.l8) this.d).f28029e3.size()) {
                    return 1;
                }
                return 0;
            case 5:
                return 0;
            default:
                return super.d(i10);
        }
    }

    @Override
    public final void t(s4.c1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x7.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        switch (this.f43459c) {
            case 0:
                return new s4.c1(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f22886a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f22887b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f22888c = qVar;
                qVar.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                linearLayout.addView(qVar, w7.b6.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                linearLayout.addView(textView, w7.b6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.i0.L(0.5f)));
                paint2.setColor(-1);
                return new s4.c1(linearLayout);
            case 2:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.d;
                return new s4.c1(new org.telegram.ui.Components.m8(l8Var.f28034j3, l8Var.getContext()));
            case 3:
                return new s4.c1(((org.telegram.ui.Components.jm) this.d).f27404w);
            case 4:
                return new s4.c1(new bi.t0(this, ((org.telegram.ui.Components.kn) this.d).getContext(), 11));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) this.d;
                org.telegram.ui.Components.ab0 ab0Var = ua0Var.f30881c0;
                org.telegram.ui.Components.sa0 sa0Var = new org.telegram.ui.Components.sa0(this, context2, ab0Var.f24360x, ua0Var.J, ab0Var.F);
                sa0Var.setClipChildren(false);
                sa0Var.setClipToPadding(false);
                sa0Var.setDelegate(new org.telegram.ui.Components.ta0(this));
                return new s4.c1(sa0Var);
            default:
                org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(viewGroup.getContext(), null);
                p80Var.setGravity(17);
                p80Var.setTypeface(org.telegram.messenger.i0.o());
                p80Var.setTextSize(1, 14.0f);
                p80Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                p80Var.setSingleLine();
                p80Var.setMaxLines(1);
                p80Var.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(28.0f)));
                w7.e6.b(p80Var, 0.075f, 1.4f);
                return new s4.c1(p80Var);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int[] f7;
        switch (this.f43459c) {
            case 5:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) this.d;
                org.telegram.ui.Components.oa0 oa0Var = ua0Var.e;
                org.telegram.ui.Components.ab0 ab0Var = ua0Var.f30881c0;
                if (ua0Var.f30884r != null && (i10 = ua0Var.f30876a) != 1) {
                    View view = c1Var.f47898a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i10 == 0) {
                            org.telegram.messenger.ej a2 = org.telegram.ui.Components.ua0.a(ua0Var, q1Var.getMessageObject());
                            if (a2 == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q1Var.setDrawSelectionBackground(z10);
                            if (a2 == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            q1Var.h3(true, z11, false);
                            org.telegram.messenger.nj njVar = ab0Var.d;
                            if (!njVar.f17119i && njVar.d != null && ua0Var.e(q1Var)) {
                                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.nj njVar2 = ab0Var.d;
                                org.telegram.messenger.nj njVar3 = ab0Var.d;
                                kn knVar = njVar3.d;
                                if (knVar.f38914m && messageObject != null && messageObject.f16385w2 != null && ((i11 = njVar3.e) < 0 || njVar3.f17117f <= i11)) {
                                    String str = knVar.f38910i;
                                    if (str == null) {
                                        f7 = null;
                                    } else {
                                        f7 = org.telegram.messenger.zv.f(messageObject, str, knVar.f38916o);
                                    }
                                    if (f7 != null) {
                                        njVar2.e = f7[0];
                                        njVar2.f17117f = f7[1];
                                    } else {
                                        njVar2.e = 0;
                                        njVar2.f17117f = Math.min(org.telegram.messenger.vp.r1(ab0Var.f24360x).f18871p4, kn.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.nj njVar4 = ab0Var.d;
                            if (!njVar4.f17119i && njVar4.d != null && njVar4.e >= 0 && ua0Var.e(q1Var) && !oa0Var.x()) {
                                org.telegram.messenger.nj njVar5 = ab0Var.d;
                                oa0Var.a0(q1Var, njVar5.e, njVar5.f17117f);
                                if (ua0Var.f30879b0) {
                                    ua0Var.L = D(q1Var, ab0Var.d.e, false);
                                    ua0Var.M = D(q1Var, ab0Var.d.f17117f, true);
                                    ua0Var.N = true;
                                    ua0Var.f30879b0 = false;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        q1Var.setDrawSelectionBackground(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }

    private final void F(s4.c1 c1Var, int i10) {
    }
}
