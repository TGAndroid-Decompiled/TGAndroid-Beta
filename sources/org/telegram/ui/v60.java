package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v60 extends org.telegram.ui.Components.lm0 {
    public final Context f44722c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final x60 f44723f;

    public v60(x60 x60Var, Context context) {
        this.f44723f = x60Var;
        this.f44722c = context;
    }

    @Override
    public final void A(s4.e1 e1Var) {
        if (e1Var.f47741f == 2) {
            ((org.telegram.ui.Cells.k4) e1Var.f47738a).f24321a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f44723f.Q) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final int j(int i10) {
        return ((u60) this.e.get(i10)).f47040a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new qg.a(0, true));
        x60 x60Var = this.f44723f;
        if (x60Var.P == 5) {
            arrayList.add(new qg.a(6, true));
            arrayList.add(new u60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new qg.a(4, true));
            arrayList.add(new u60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (x60Var.T != null) {
            arrayList.add(new qg.a(1, true));
            arrayList.add(new qg.a(3, true));
            arrayList.add(new qg.a(0, true));
        }
        if (x60Var.K.size() > 0) {
            arrayList.add(new qg.a(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < x60Var.K.size(); i10++) {
                arrayList.add(new qg.a(2, true));
            }
            arrayList.add(new qg.a(7, true));
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String formatTTLString;
        boolean z10;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        ArrayList arrayList = this.e;
        boolean z11 = false;
        x60 x60Var = this.f44723f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (x60Var.T != null && i10 == 1) {
                    q4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    q4Var.setText(LocaleController.formatPluralString("Members", x60Var.K.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                k4Var.d(x60Var.getMessagesController().getUser((Long) x60Var.K.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                }
                k4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.ga) view).b(x60Var.T, false);
                return;
            case 4:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                int i12 = x60Var.W;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.r2) x60Var).fragmentBeginToShow;
                v8Var.u(string, str, z10, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.i9) view).setText(((u60) arrayList.get(i10)).f44029c);
                return;
            case 6:
                org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                v8Var2.n(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                v8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q4 q4Var;
        Context context = this.f44722c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    q4Var = new org.telegram.ui.Cells.ga(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    q4Var = view;
                                }
                            } else {
                                q4Var = new org.telegram.ui.Cells.v8(23, this.f44722c, this.f44723f.getResourceProvider(), false, true);
                            }
                        } else {
                            q4Var = new org.telegram.ui.Cells.i9(context);
                        }
                    } else {
                        q4Var = new org.telegram.ui.Cells.v8(context);
                    }
                } else {
                    q4Var = new org.telegram.ui.Cells.k4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context);
                q4Var2.setHeight(46);
                q4Var = q4Var2;
            }
        } else {
            q4Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        }
        return new s4.e1(q4Var);
    }
}
