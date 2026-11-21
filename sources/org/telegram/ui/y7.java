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
    public final int f54070c;
    public final Object d;

    public y7(Object obj, int i7) {
        this.f54070c = i7;
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
            org.telegram.ui.Cells.y1 y1Var = r1Var.f31468ib;
            org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.f24050y2 != null) {
                    r1Var.V2(true);
                    org.telegram.messenger.ev evVar = messageObject.f24050y2;
                    ArrayList arrayList2 = evVar.f23806n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) evVar.f23807o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                int y10 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).getY() + r1Var.f31617u0;
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
                    if (!TextUtils.isEmpty(messageObject.f24051z) && (djVar = r1Var.f31512m3) != null) {
                        i10 = (int) r1Var.f31607t3;
                        charSequence = messageObject.f24051z;
                        arrayList = djVar.f23561e;
                    } else {
                        r1Var.V2(true);
                        int i11 = r1Var.f31617u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        if (r1Var.f31632v1) {
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
                            StaticLayout staticLayout = cjVar.f23389e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i13 = cjVar.f23391n;
                            if (i7 > i13) {
                                if (i7 - i13 > charSequence3.length() - 1) {
                                    p10 = i10 + ((int) (cjVar.p(arrayList, y1Var) + cjVar.f23390f + cjVar.f23394w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - cjVar.f23391n);
                                    if (z10) {
                                        lineTop = staticLayout.getLineBottom(lineForOffset2);
                                    } else {
                                        lineTop = staticLayout.getLineTop(lineForOffset2);
                                    }
                                    p10 = lineTop + cjVar.p(arrayList, y1Var) + i10 + cjVar.f23390f;
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
        switch (this.f54070c) {
            case 0:
                return ((i8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f31822f3.size();
            case 2:
                return ((org.telegram.ui.Components.v8) this.d).f40717f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.hj hjVar = ((org.telegram.ui.Components.qa0) this.d).f38868r;
                if (hjVar == null) {
                    return 0;
                }
                return hjVar.f24484f.size();
            default:
                return ((km0) this.d).f49355f.size();
        }
    }

    @Override
    public long c(int i7) {
        switch (this.f54070c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.J - (i7 / 12)) * 100) + (i8Var.K - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) this.d;
                if (i7 >= v8Var.f40717f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.u8) v8Var.f40717f3.get(i7)).f40297a;
        }
    }

    @Override
    public int d(int i7) {
        switch (this.f54070c) {
            case 2:
                if (i7 >= ((org.telegram.ui.Components.v8) this.d).f40717f3.size()) {
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
        switch (this.f54070c) {
            case 0:
                return new v4.f1(new f8((i8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f31763a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f31764b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f31765c = qVar;
                qVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                linearLayout.addView(qVar, c8.ma.r(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                linearLayout.addView(textView, c8.ma.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new v4.f1(linearLayout);
            case 2:
                org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) this.d;
                return new v4.f1(new org.telegram.ui.Components.w8(v8Var.f40721k3, v8Var.getContext()));
            case 3:
                return new v4.f1(((org.telegram.ui.Components.rm) this.d).f39273w);
            case 4:
                return new v4.f1(new bi.m3(17, ((org.telegram.ui.Components.un) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) this.d;
                org.telegram.ui.Components.wa0 wa0Var = qa0Var.f38864d0;
                org.telegram.ui.Components.oa0 oa0Var = new org.telegram.ui.Components.oa0(this, context2, wa0Var.f41752x, qa0Var.K, wa0Var.G);
                oa0Var.setClipChildren(false);
                oa0Var.setClipToPadding(false);
                oa0Var.setDelegate(new org.telegram.ui.Components.pa0(this));
                return new v4.f1(oa0Var);
            default:
                org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(viewGroup.getContext(), null);
                m80Var.setGravity(17);
                m80Var.setTypeface(org.telegram.messenger.g0.o());
                m80Var.setTextSize(1, 14.0f);
                m80Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                m80Var.setEllipsize(TextUtils.TruncateAt.END);
                m80Var.setSingleLine();
                m80Var.setMaxLines(1);
                m80Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.ra.b(m80Var, 0.075f, 1.4f);
                return new v4.f1(m80Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        int i7;
        boolean z10;
        boolean z11;
        int i10;
        int[] f10;
        switch (this.f54070c) {
            case 5:
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) this.d;
                org.telegram.ui.Components.ka0 ka0Var = qa0Var.f38865e;
                org.telegram.ui.Components.wa0 wa0Var = qa0Var.f38864d0;
                if (qa0Var.f38868r != null && (i7 = qa0Var.f38858a) != 1) {
                    View view = f1Var.f59161a;
                    if (view instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                        if (i7 == 0) {
                            org.telegram.messenger.aj a10 = org.telegram.ui.Components.qa0.a(qa0Var, r1Var.getMessageObject());
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
                            org.telegram.messenger.jj jjVar = wa0Var.d;
                            if (!jjVar.f24898i && jjVar.d != null && qa0Var.e(r1Var)) {
                                org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                                org.telegram.messenger.jj jjVar2 = wa0Var.d;
                                org.telegram.messenger.jj jjVar3 = wa0Var.d;
                                rm rmVar = jjVar3.d;
                                if (rmVar.f51625m && messageObject != null && messageObject.f24050y2 != null && ((i10 = jjVar3.f24895e) < 0 || jjVar3.f24896f <= i10)) {
                                    String str = rmVar.f51621i;
                                    if (str == null) {
                                        f10 = null;
                                    } else {
                                        f10 = org.telegram.messenger.iv.f(messageObject, str, rmVar.f51627o);
                                    }
                                    if (f10 != null) {
                                        jjVar2.f24895e = f10[0];
                                        jjVar2.f24896f = f10[1];
                                    } else {
                                        jjVar2.f24895e = 0;
                                        jjVar2.f24896f = Math.min(org.telegram.messenger.mp.u1(wa0Var.f41752x).f25777r4, rm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.jj jjVar4 = wa0Var.d;
                            if (!jjVar4.f24898i && jjVar4.d != null && jjVar4.f24895e >= 0 && qa0Var.e(r1Var) && !ka0Var.x()) {
                                org.telegram.messenger.jj jjVar5 = wa0Var.d;
                                ka0Var.a0(r1Var, jjVar5.f24895e, jjVar5.f24896f);
                                if (qa0Var.f38863c0) {
                                    qa0Var.M = D(r1Var, wa0Var.d.f24895e, false);
                                    qa0Var.N = D(r1Var, wa0Var.d.f24896f, true);
                                    qa0Var.O = true;
                                    qa0Var.f38863c0 = false;
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
