package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class s60 extends org.telegram.ui.Components.yk0 {

    public final Context f42525c;
    public int d;

    public final ArrayList f42526e = new ArrayList();

    public final u60 f42527f;

    public s60(u60 u60Var, Context context) {
        this.f42527f = u60Var;
        this.f42525c = context;
    }

    @Override
    public final void A(f2.o1 o1Var) {
        if (o1Var.f5793f == 2) {
            ((org.telegram.ui.Cells.d4) o1Var.f5789a).f24204a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f42527f.M;
    }

    @Override
    public final int h() {
        return this.f42526e.size();
    }

    @Override
    public final int j(int i10) {
        return ((r60) this.f42526e.get(i10)).f49413a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f42526e;
        arrayList.clear();
        arrayList.add(new r60(0, true));
        u60 u60Var = this.f42527f;
        if (u60Var.L == 5) {
            arrayList.add(new r60(6, true));
            arrayList.add(new r60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new r60(4, true));
            arrayList.add(new r60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (u60Var.P != null) {
            arrayList.add(new r60(1, true));
            arrayList.add(new r60(3, true));
            arrayList.add(new r60(0, true));
        }
        if (u60Var.G.size() > 0) {
            arrayList.add(new r60(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < u60Var.G.size(); i10++) {
                arrayList.add(new r60(2, true));
            }
            arrayList.add(new r60(7, true));
        }
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        ArrayList arrayList = this.f42526e;
        u60 u60Var = this.f42527f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (u60Var.P != null && i10 == 1) {
                    j4Var.setText(LocaleController.getString(R.string.AttachLocation));
                } else {
                    j4Var.setText(LocaleController.formatPluralString("Members", u60Var.G.size(), new Object[0]));
                }
                break;
            case 2:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                d4Var.d(u60Var.getMessagesController().getUser((Long) u60Var.G.get(i10 - this.d)), null, null);
                d4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.x9) view).b(u60Var.P, false);
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i12 = u60Var.S;
                l8Var.s(LocaleController.getString(R.string.AutoDeleteMessages), i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12), ((org.telegram.ui.ActionBar.n2) u60Var).fragmentBeginToShow, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.x8) view).setText(((r60) arrayList.get(i10)).f41821c);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                l8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                l8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View l8Var;
        Context context = this.f42525c;
        if (i10 == 0) {
            l8Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            j4Var.setHeight(46);
            l8Var = j4Var;
        } else if (i10 == 2) {
            l8Var = new org.telegram.ui.Cells.d4(context, 0, 3, false);
        } else if (i10 == 4) {
            l8Var = new org.telegram.ui.Cells.l8(context);
        } else if (i10 == 5) {
            l8Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 == 6) {
            l8Var = new org.telegram.ui.Cells.l8(23, this.f42525c, this.f42527f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            l8Var = new org.telegram.ui.Cells.x9(context);
        } else {
            View view = new View(context);
            view.setTag(-33024);
            l8Var = view;
        }
        return new org.telegram.ui.Components.lk0(l8Var);
    }
}
