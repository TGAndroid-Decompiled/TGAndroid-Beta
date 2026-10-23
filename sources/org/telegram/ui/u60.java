package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u60 extends org.telegram.ui.Components.lm0 {
    public final Context f42283c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final w60 f42284f;

    public u60(w60 w60Var, Context context) {
        this.f42284f = w60Var;
        this.f42283c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        if (b1Var.f46346f == 2) {
            ((org.telegram.ui.Cells.f4) b1Var.f46343a).f22357a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f42284f.Q) {
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
        return ((t60) this.e.get(i10)).f44713a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new pg.a(0, true));
        w60 w60Var = this.f42284f;
        if (w60Var.P == 5) {
            arrayList.add(new pg.a(6, true));
            arrayList.add(new t60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new pg.a(4, true));
            arrayList.add(new t60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (w60Var.T != null) {
            arrayList.add(new pg.a(1, true));
            arrayList.add(new pg.a(3, true));
            arrayList.add(new pg.a(0, true));
        }
        if (w60Var.K.size() > 0) {
            arrayList.add(new pg.a(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < w60Var.K.size(); i10++) {
                arrayList.add(new pg.a(2, true));
            }
            arrayList.add(new pg.a(7, true));
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String formatTTLString;
        boolean z10;
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        ArrayList arrayList = this.e;
        boolean z11 = false;
        w60 w60Var = this.f42284f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (w60Var.T != null && i10 == 1) {
                    l4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    l4Var.setText(LocaleController.formatPluralString("Members", w60Var.K.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                f4Var.d(w60Var.getMessagesController().getUser((Long) w60Var.K.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                }
                f4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.ca) view).b(w60Var.T, false);
                return;
            case 4:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i12 = w60Var.W;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.o2) w60Var).fragmentBeginToShow;
                r8Var.u(string, str, z10, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.e9) view).setText(((t60) arrayList.get(i10)).f41882c);
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                r8Var2.n(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                r8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        Context context = this.f42283c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    l4Var = new org.telegram.ui.Cells.ca(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    l4Var = view;
                                }
                            } else {
                                l4Var = new org.telegram.ui.Cells.r8(23, this.f42283c, this.f42284f.getResourceProvider(), false, true);
                            }
                        } else {
                            l4Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        l4Var = new org.telegram.ui.Cells.r8(context);
                    }
                } else {
                    l4Var = new org.telegram.ui.Cells.f4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
                l4Var2.setHeight(46);
                l4Var = l4Var2;
            }
        } else {
            l4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        }
        return new s4.b1(l4Var);
    }
}
