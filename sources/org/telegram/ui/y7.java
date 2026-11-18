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
public final class y7 extends v4.i0 {
    public final int f54023c;
    public final Object d;

    public y7(Object obj, int i7) {
        this.f54023c = i7;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.r1 r1Var, int i7, boolean z10) {
        int i10;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p10;
        org.telegram.messenger.dj djVar;
        int lineTop2;
        if (r1Var != null) {
            org.telegram.ui.Cells.y1 y1Var = r1Var.f31440ib;
            org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.f24022y2 != null) {
                    r1Var.V2(true);
                    org.telegram.messenger.ev evVar = messageObject.f24022y2;
                    ArrayList arrayList2 = evVar.f23778n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) evVar.f23779o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                int y10 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).getY() + r1Var.f31589u0;
                                if (z10) {
                                    lineTop2 = a10.getLineBottom(lineForOffset);
                                } else {
                                    lineTop2 = a10.getLineTop(lineForOffset);
                                }
                                return y10 + lineTop2;
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (!TextUtils.isEmpty(messageObject.f24023z) && (djVar = r1Var.f31484m3) != null) {
                        i10 = (int) r1Var.f31579t3;
                        charSequence = messageObject.f24023z;
                        arrayList = djVar.f23533e;
                    } else {
                        r1Var.V2(true);
                        int i11 = r1Var.f31589u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        if (r1Var.f31604v1) {
                            i10 = org.telegram.messenger.f3.C(10.0f, r1Var.W1, i11);
                        } else {
                            i10 = i11;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) arrayList.get(i12);
                            StaticLayout staticLayout = cjVar.f23361e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i13 = cjVar.f23363n;
                            if (i7 > i13) {
                                if (i7 - i13 > charSequence3.length() - 1) {
                                    p10 = i10 + ((int) (cjVar.p(arrayList, y1Var) + cjVar.f23362f + cjVar.f23366w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - cjVar.f23363n);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p10 = lineTop + cjVar.p(arrayList, y1Var) + i10 + cjVar.f23362f;
                                }
                                return (int) p10;
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
        switch (this.f54023c) {
            case 0:
                return ((i8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f31794f3.size();
            case 2:
                return ((org.telegram.ui.Components.v8) this.d).f40524f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.hj hjVar = ((org.telegram.ui.Components.oa0) this.d).f38049r;
                if (hjVar == null) {
                    return 0;
                }
                return hjVar.f24456f.size();
            default:
                return ((km0) this.d).f49314f.size();
        }
    }

    @Override
    public long c(int i7) {
        switch (this.f54023c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.J - (i7 / 12)) * 100) + (i8Var.K - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) this.d;
                if (i7 >= v8Var.f40524f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.u8) v8Var.f40524f3.get(i7)).f40250a;
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f54023c) {
            case 2:
                if (i7 >= ((org.telegram.ui.Components.v8) this.d).f40524f3.size()) {
                    return 1;
                }
                return 0;
            case 5:
                return 0;
            default:
                return super.d(i7);
        }
    }

    @Override
    public final void t(v4.f1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y7.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.f54023c) {
            case 0:
                return new v4.f1(new f8((i8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f31735a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f31736b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f31737c = qVar;
                qVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(qVar, c8.ma.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                linearLayout.addView(textView, c8.ma.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new v4.f1(linearLayout);
            case 2:
                org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) this.d;
                return new v4.f1(new org.telegram.ui.Components.w8(v8Var.f40528k3, v8Var.getContext()));
            case 3:
                return new v4.f1(((org.telegram.ui.Components.pm) this.d).f38489w);
            case 4:
                return new v4.f1(new bi.i3(17, ((org.telegram.ui.Components.sn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.oa0 oa0Var = (org.telegram.ui.Components.oa0) this.d;
                org.telegram.ui.Components.ua0 ua0Var = oa0Var.f38045d0;
                org.telegram.ui.Components.ma0 ma0Var = new org.telegram.ui.Components.ma0(this, context2, ua0Var.f40286x, oa0Var.K, ua0Var.G);
                ma0Var.setClipChildren(false);
                ma0Var.setClipToPadding(false);
                ma0Var.setDelegate(new org.telegram.ui.Components.na0(this));
                return new v4.f1(ma0Var);
            default:
                org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(viewGroup.getContext(), null);
                k80Var.setGravity(17);
                k80Var.setTypeface(org.telegram.messenger.g0.o());
                k80Var.setTextSize(1, 14.0f);
                k80Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                k80Var.setEllipsize(TextUtils.TruncateAt.END);
                k80Var.setSingleLine();
                k80Var.setMaxLines(1);
                k80Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.ra.b(k80Var, 0.075f, 1.4f);
                return new v4.f1(k80Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        int i7;
        boolean z10;
        boolean z11;
        int i10;
        int[] f10;
        switch (this.f54023c) {
            case 5:
                org.telegram.ui.Components.oa0 oa0Var = (org.telegram.ui.Components.oa0) this.d;
                org.telegram.ui.Components.ia0 ia0Var = oa0Var.f38046e;
                org.telegram.ui.Components.ua0 ua0Var = oa0Var.f38045d0;
                if (oa0Var.f38049r != null && (i7 = oa0Var.f38039a) != 1) {
                    View view = f1Var.f59123a;
                    if (view instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                        if (i7 == 0) {
                            org.telegram.messenger.aj a10 = org.telegram.ui.Components.oa0.a(oa0Var, r1Var.getMessageObject());
                            if (a10 == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            r1Var.setDrawSelectionBackground(z10);
                            if (a10 == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            r1Var.n3(true, z11, false);
                            org.telegram.messenger.jj jjVar = ua0Var.d;
                            if (!jjVar.f24870i && jjVar.d != null && oa0Var.e(r1Var)) {
                                org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                                org.telegram.messenger.jj jjVar2 = ua0Var.d;
                                org.telegram.messenger.jj jjVar3 = ua0Var.d;
                                rm rmVar = jjVar3.d;
                                if (rmVar.f51650m && messageObject != null && messageObject.f24022y2 != null && ((i10 = jjVar3.f24867e) < 0 || jjVar3.f24868f <= i10)) {
                                    String str = rmVar.f51646i;
                                    if (str == null) {
                                        f10 = null;
                                    } else {
                                        f10 = org.telegram.messenger.iv.f(messageObject, str, rmVar.f51652o);
                                    }
                                    if (f10 != null) {
                                        jjVar2.f24867e = f10[0];
                                        jjVar2.f24868f = f10[1];
                                    } else {
                                        jjVar2.f24867e = 0;
                                        jjVar2.f24868f = Math.min(org.telegram.messenger.mp.u1(ua0Var.f40286x).f25749r4, rm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.jj jjVar4 = ua0Var.d;
                            if (!jjVar4.f24870i && jjVar4.d != null && jjVar4.f24867e >= 0 && oa0Var.e(r1Var) && !ia0Var.x()) {
                                org.telegram.messenger.jj jjVar5 = ua0Var.d;
                                ia0Var.a0(r1Var, jjVar5.f24867e, jjVar5.f24868f);
                                if (oa0Var.f38044c0) {
                                    oa0Var.M = D(r1Var, ua0Var.d.f24867e, false);
                                    oa0Var.N = D(r1Var, ua0Var.d.f24868f, true);
                                    oa0Var.O = true;
                                    oa0Var.f38044c0 = false;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        r1Var.setDrawSelectionBackground(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void E(v4.f1 f1Var, int i7) {
    }

    private final void F(v4.f1 f1Var, int i7) {
    }
}
