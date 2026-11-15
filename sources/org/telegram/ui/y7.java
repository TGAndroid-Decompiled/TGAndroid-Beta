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
public final class y7 extends v4.h0 {
    public final int f53461c;
    public final Object d;

    public y7(Object obj, int i7) {
        this.f53461c = i7;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z10) {
        int i10;
        ArrayList arrayList;
        CharSequence charSequence;
        int lineTop;
        float p10;
        org.telegram.messenger.ej ejVar;
        int lineTop2;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.f31018ib;
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.f23874y2 != null) {
                    q1Var.T2(true);
                    org.telegram.messenger.iv ivVar = messageObject.f23874y2;
                    ArrayList arrayList2 = ivVar.f24451n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) ivVar.f24452o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.s9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                int y10 = ((org.telegram.ui.Cells.s9) arrayList2.get(size)).getY() + q1Var.f31167u0;
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
                    if (!TextUtils.isEmpty(messageObject.f23875z) && (ejVar = q1Var.f31062m3) != null) {
                        i10 = (int) q1Var.f31157t3;
                        charSequence = messageObject.f23875z;
                        arrayList = ejVar.f23310e;
                    } else {
                        q1Var.T2(true);
                        int i11 = q1Var.f31167u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        if (q1Var.f31182v1) {
                            i10 = org.telegram.messenger.k5.C(10.0f, q1Var.W1, i11);
                        } else {
                            i10 = i11;
                        }
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) arrayList.get(i12);
                            StaticLayout staticLayout = djVar.f23093e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i13 = djVar.f23095n;
                            if (i7 > i13) {
                                if (i7 - i13 > charSequence3.length() - 1) {
                                    p10 = i10 + ((int) (djVar.p(arrayList, x1Var) + djVar.f23094f + djVar.f23098w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - djVar.f23095n);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p10 = lineTop + djVar.p(arrayList, x1Var) + i10 + djVar.f23094f;
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
        switch (this.f53461c) {
            case 0:
                return ((i8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f31442f3.size();
            case 2:
                return ((org.telegram.ui.Components.n8) this.d).f37482f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.ij ijVar = ((org.telegram.ui.Components.da0) this.d).f33904r;
                if (ijVar == null) {
                    return 0;
                }
                return ijVar.f24404f.size();
            default:
                return ((hm0) this.d).f47744f.size();
        }
    }

    @Override
    public long c(int i7) {
        switch (this.f53461c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.J - (i7 / 12)) * 100) + (i8Var.K - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                org.telegram.ui.Components.n8 n8Var = (org.telegram.ui.Components.n8) this.d;
                if (i7 >= n8Var.f37482f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.m8) n8Var.f37482f3.get(i7)).f37161a;
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f53461c) {
            case 2:
                if (i7 >= ((org.telegram.ui.Components.n8) this.d).f37482f3.size()) {
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
    public final void t(v4.e1 r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y7.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.f53461c) {
            case 0:
                return new v4.e1(new f8((i8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f31378a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f31379b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f31380c = qVar;
                qVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(qVar, c8.ja.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
                linearLayout.addView(textView, c8.ja.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new v4.e1(linearLayout);
            case 2:
                org.telegram.ui.Components.n8 n8Var = (org.telegram.ui.Components.n8) this.d;
                return new v4.e1(new org.telegram.ui.Components.o8(n8Var.f37486k3, n8Var.getContext()));
            case 3:
                return new v4.e1(((org.telegram.ui.Components.im) this.d).f35665w);
            case 4:
                return new v4.e1(new bi.o2(17, ((org.telegram.ui.Components.kn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) this.d;
                org.telegram.ui.Components.ja0 ja0Var = da0Var.f33900d0;
                org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(this, context2, ja0Var.f35957x, da0Var.K, ja0Var.G);
                ba0Var.setClipChildren(false);
                ba0Var.setClipToPadding(false);
                ba0Var.setDelegate(new org.telegram.ui.Components.ca0(this));
                return new v4.e1(ba0Var);
            default:
                org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(viewGroup.getContext(), null);
                z70Var.setGravity(17);
                z70Var.setTypeface(org.telegram.messenger.g0.o());
                z70Var.setTextSize(1, 14.0f);
                z70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                z70Var.setEllipsize(TextUtils.TruncateAt.END);
                z70Var.setSingleLine();
                z70Var.setMaxLines(1);
                z70Var.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.na.b(z70Var, 0.075f, 1.4f);
                return new v4.e1(z70Var);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        int i7;
        boolean z10;
        boolean z11;
        int i10;
        int[] f10;
        switch (this.f53461c) {
            case 5:
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) this.d;
                org.telegram.ui.Components.x90 x90Var = da0Var.f33901e;
                org.telegram.ui.Components.ja0 ja0Var = da0Var.f33900d0;
                if (da0Var.f33904r != null && (i7 = da0Var.f33894a) != 1) {
                    View view = e1Var.f58535a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i7 == 0) {
                            org.telegram.messenger.bj a10 = org.telegram.ui.Components.da0.a(da0Var, q1Var.getMessageObject());
                            if (a10 == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q1Var.setDrawSelectionBackground(z10);
                            if (a10 == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            q1Var.m3(true, z11, false);
                            org.telegram.messenger.kj kjVar = ja0Var.d;
                            if (!kjVar.f24709i && kjVar.d != null && da0Var.e(q1Var)) {
                                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.kj kjVar2 = ja0Var.d;
                                org.telegram.messenger.kj kjVar3 = ja0Var.d;
                                qm qmVar = kjVar3.d;
                                if (qmVar.f50653m && messageObject != null && messageObject.f23874y2 != null && ((i10 = kjVar3.f24706e) < 0 || kjVar3.f24707f <= i10)) {
                                    String str = qmVar.f50649i;
                                    if (str == null) {
                                        f10 = null;
                                    } else {
                                        f10 = org.telegram.messenger.mv.f(messageObject, str, qmVar.f50655o);
                                    }
                                    if (f10 != null) {
                                        kjVar2.f24706e = f10[0];
                                        kjVar2.f24707f = f10[1];
                                    } else {
                                        kjVar2.f24706e = 0;
                                        kjVar2.f24707f = Math.min(org.telegram.messenger.np.s1(ja0Var.f35957x).f25361p4, qm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.kj kjVar4 = ja0Var.d;
                            if (!kjVar4.f24709i && kjVar4.d != null && kjVar4.f24706e >= 0 && da0Var.e(q1Var) && !x90Var.x()) {
                                org.telegram.messenger.kj kjVar5 = ja0Var.d;
                                x90Var.a0(q1Var, kjVar5.f24706e, kjVar5.f24707f);
                                if (da0Var.f33899c0) {
                                    da0Var.M = D(q1Var, ja0Var.d.f24706e, false);
                                    da0Var.N = D(q1Var, ja0Var.d.f24707f, true);
                                    da0Var.O = true;
                                    da0Var.f33899c0 = false;
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

    private final void E(v4.e1 e1Var, int i7) {
    }

    private final void F(v4.e1 e1Var, int i7) {
    }
}
