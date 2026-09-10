package sg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import pg.f2;
public final class o0 extends ul0 {
    public final u0 f41964c;

    public o0(u0 u0Var) {
        this.f41964c = u0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f41964c.Y.size() + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    return 3;
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        u0 u0Var = this.f41964c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) u0Var.Y.get(i10 - 3);
            wg.k kVar = (wg.k) view;
            kVar.setBoost(tL_myBoost);
            kVar.c(u0Var.X.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            t0 t0Var = (t0) view;
            u0Var.f42011b0 = t0Var;
            TLRPC.Chat chat = u0Var.Z;
            m90 m90Var = t0Var.e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), j6.gc, 2, new qg.q0(u0Var, 15));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                m90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                m90Var.post(new f2(t0Var, indexOf, 1));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        f6 f6Var;
        Context context = viewGroup.getContext();
        u0 u0Var = this.f41964c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        f6Var = ((h3) u0Var).resourcesProvider;
                        view = new wg.k(context, true, false, f6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new m4(context, 22);
                }
            } else {
                view = new c7(context, j6.w0(null, j6.f17872a7, false), 0);
            }
        } else {
            t0 t0Var = new t0(context);
            t0Var.a(u0Var.X, u0Var.Z);
            view = t0Var;
        }
        return e2.j(view, view, -1, -2);
    }
}
