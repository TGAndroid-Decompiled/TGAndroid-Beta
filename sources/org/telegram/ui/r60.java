package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r60 extends org.telegram.ui.Components.il0 {
    public final Context f41980c;
    public int d;
    public final ArrayList f41981e = new ArrayList();
    public final t60 f41982f;

    public r60(t60 t60Var, Context context) {
        this.f41982f = t60Var;
        this.f41980c = context;
    }

    @Override
    public final void A(f2.n1 n1Var) {
        if (n1Var.f6436f == 2) {
            ((org.telegram.ui.Cells.e4) n1Var.f6432a).f24277a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f41982f.M) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f41981e.size();
    }

    @Override
    public final int j(int i10) {
        return ((q60) this.f41981e.get(i10)).f50845a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f41981e;
        arrayList.clear();
        arrayList.add(new zf.a(0, true));
        t60 t60Var = this.f41982f;
        if (t60Var.L == 5) {
            arrayList.add(new zf.a(6, true));
            arrayList.add(new q60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new zf.a(4, true));
            arrayList.add(new q60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (t60Var.P != null) {
            arrayList.add(new zf.a(1, true));
            arrayList.add(new zf.a(3, true));
            arrayList.add(new zf.a(0, true));
        }
        if (t60Var.G.size() > 0) {
            arrayList.add(new zf.a(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < t60Var.G.size(); i10++) {
                arrayList.add(new zf.a(2, true));
            }
            arrayList.add(new zf.a(7, true));
        }
        super.l();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String formatTTLString;
        boolean z10;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        ArrayList arrayList = this.f41981e;
        boolean z11 = false;
        t60 t60Var = this.f41982f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (t60Var.P != null && i10 == 1) {
                    k4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    k4Var.setText(LocaleController.formatPluralString("Members", t60Var.G.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                e4Var.d(t60Var.getMessagesController().getUser((Long) t60Var.G.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                }
                e4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.y9) view).b(t60Var.P, false);
                return;
            case 4:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                int i12 = t60Var.S;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.o2) t60Var).fragmentBeginToShow;
                m8Var.s(string, str, z10, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.y8) view).setText(((q60) arrayList.get(i10)).f41546c);
                return;
            case 6:
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                m8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k4 k4Var;
        Context context = this.f41980c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    k4Var = new org.telegram.ui.Cells.y9(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    k4Var = view;
                                }
                            } else {
                                k4Var = new org.telegram.ui.Cells.m8(23, this.f41980c, this.f41982f.getResourceProvider(), false, true);
                            }
                        } else {
                            k4Var = new org.telegram.ui.Cells.y8(context);
                        }
                    } else {
                        k4Var = new org.telegram.ui.Cells.m8(context);
                    }
                } else {
                    k4Var = new org.telegram.ui.Cells.e4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context);
                k4Var2.setHeight(46);
                k4Var = k4Var2;
            }
        } else {
            k4Var = new org.telegram.ui.Cells.x6(context, (b) null);
        }
        return new f2.n1(k4Var);
    }
}
