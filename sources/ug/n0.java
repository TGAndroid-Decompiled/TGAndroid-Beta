package ug;

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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.kl0;
public final class n0 extends kl0 {
    public final t0 f47156c;

    public n0(t0 t0Var) {
        this.f47156c = t0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f47156c.Y.size() + 3;
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
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        t0 t0Var = this.f47156c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) t0Var.Y.get(i10 - 3);
            yg.l lVar = (yg.l) view;
            lVar.setBoost(tL_myBoost);
            lVar.c(t0Var.X.contains(tL_myBoost), false);
        } else if (i11 == 2) {
            l4 l4Var = (l4) view;
            l4Var.setTextSize(15.0f);
            l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            l4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
        } else if (i11 == 0) {
            s0 s0Var = (s0) view;
            t0Var.f47210b0 = s0Var;
            TLRPC.Chat chat = t0Var.Z;
            d90 d90Var = s0Var.f47207e;
            try {
                int i12 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i12, str, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), j6.gc, 2, new sg.p0(t0Var, 11));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                d90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                d90Var.post(new rg.f(s0Var, indexOf, 3));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        f6 f6Var;
        Context context = viewGroup.getContext();
        t0 t0Var = this.f47156c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        f6Var = ((f3) t0Var).resourcesProvider;
                        view = new yg.l(context, true, false, f6Var, true);
                    } else {
                        view = new View(context);
                    }
                } else {
                    view = new l4(context, 22);
                }
            } else {
                view = new a7(context, j6.w0(null, j6.f20607a7, false), 0);
            }
        } else {
            s0 s0Var = new s0(context);
            s0Var.a(t0Var.X, t0Var.Z);
            view = s0Var;
        }
        return e2.l(view, view, -1, -2);
    }
}
