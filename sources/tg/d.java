package tg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.o41;
public final class d extends lm0 {
    public final u6 f48840c;
    public final int d;
    public final int e;
    public final ArrayList f48841f;
    public final a1 h;
    public int f48842n;
    public c f48843r;
    public final boolean f48844s;

    public d(int i10, u6 u6Var) {
        ArrayList arrayList = new ArrayList();
        this.f48841f = arrayList;
        this.f48844s = true;
        this.f48840c = u6Var;
        a1 a1Var = new a1(y6.Lj, y6.Mj, y6.Nj, y6.Oj, u6Var);
        this.h = a1Var;
        a1Var.f48805o = 0.0f;
        a1Var.f48806p = 0.0f;
        a1Var.f48807q = 1.0f;
        MessagesController messagesController = MessagesController.getInstance(i10);
        arrayList.add(new e(messagesController.channelsLimitDefault, messagesController.channelsLimitPremium, LocaleController.getString(R.string.GroupsAndChannelsLimitTitle), LocaleController.formatString(R.string.GroupsAndChannelsLimitSubtitle, Integer.valueOf(messagesController.channelsLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersPinnedLimitDefault, messagesController.dialogFiltersPinnedLimitPremium, LocaleController.getString(R.string.PinChatsLimitTitle), LocaleController.formatString(R.string.PinChatsLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium))));
        arrayList.add(new e(messagesController.publicLinksLimitDefault, messagesController.publicLinksLimitPremium, LocaleController.getString(R.string.PublicLinksLimitTitle), LocaleController.formatString(R.string.PublicLinksLimitSubtitle, Integer.valueOf(messagesController.publicLinksLimitPremium))));
        arrayList.add(new e(messagesController.savedGifsLimitDefault, messagesController.savedGifsLimitPremium, LocaleController.getString(R.string.SavedGifsLimitTitle), LocaleController.formatString(R.string.SavedGifsLimitSubtitle, Integer.valueOf(messagesController.savedGifsLimitPremium))));
        arrayList.add(new e(messagesController.stickersFavedLimitDefault, messagesController.stickersFavedLimitPremium, LocaleController.getString(R.string.FavoriteStickersLimitTitle), LocaleController.formatString(R.string.FavoriteStickersLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.aboutLengthLimitDefault, messagesController.aboutLengthLimitPremium, LocaleController.getString(R.string.BioLimitTitle), LocaleController.formatString(R.string.BioLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.captionLengthLimitDefault, messagesController.captionLengthLimitPremium, LocaleController.getString(R.string.CaptionsLimitTitle), LocaleController.formatString(R.string.CaptionsLimitSubtitle, Integer.valueOf(messagesController.stickersFavedLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersLimitDefault, messagesController.dialogFiltersLimitPremium, LocaleController.getString(R.string.FoldersLimitTitle), LocaleController.formatString(R.string.FoldersLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersLimitPremium))));
        arrayList.add(new e(messagesController.dialogFiltersChatsLimitDefault, messagesController.dialogFiltersChatsLimitPremium, LocaleController.getString(R.string.ChatPerFolderLimitTitle), LocaleController.formatString(R.string.ChatPerFolderLimitSubtitle, Integer.valueOf(messagesController.dialogFiltersChatsLimitPremium))));
        arrayList.add(new e(3, 4, LocaleController.getString(R.string.ConnectedAccountsLimitTitle), LocaleController.formatString(R.string.ConnectedAccountsLimitSubtitle, 4)));
        arrayList.add(new e(messagesController.recommendedChannelsLimitDefault, messagesController.recommendedChannelsLimitPremium, LocaleController.getString(R.string.SimilarChannelsLimitTitle), LocaleController.formatString(R.string.SimilarChannelsLimitSubtitle, Integer.valueOf(messagesController.recommendedChannelsLimitPremium))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f47741f == 0) {
            f fVar = (f) e1Var.f47738a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f48841f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f48857c;
            limitPreviewView.F = ((e) arrayList.get(i11)).e;
            limitPreviewView.f26221c = this.f48842n;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        x3 x3Var;
        Context context = viewGroup.getContext();
        u6 u6Var = this.f48840c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, u6Var);
                fVar.f48857c.setParentViewForGradien(this.f48843r);
                fVar.f48857c.setStaticGradinet(this.h);
                x3Var = fVar;
            } else {
                x3Var = new x3(context, 16);
            }
        } else if (this.f48844s) {
            ?? o41Var = new o41(context, 10);
            LinearLayout d = vh.d(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(b1.c(context.getDrawable(R.drawable.other_2x_large), b1.d().f48823a));
            d.addView(imageView, gb1.h(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            f7.V(textView, y6.G6, u6Var);
            textView.setTypeface(AndroidUtilities.bold());
            d.addView(textView, gb1.i(-2, -2, 16));
            o41Var.addView(d, gb1.i(-2, -2, 17));
            x3Var = o41Var;
        } else {
            x3Var = new x3(context, 64);
        }
        return ic.a.n(x3Var, x3Var, -1, -2);
    }
}
