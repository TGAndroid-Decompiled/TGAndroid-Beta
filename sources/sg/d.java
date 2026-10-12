package sg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.d61;
import w7.a6;
public final class d extends lm0 {
    public final c6 f45160c;
    public final int d;
    public final int e;
    public final ArrayList f45161f;
    public final a1 h;
    public int f45162n;
    public c f45163r;
    public final boolean f45164s;

    public d(int i10, c6 c6Var) {
        ArrayList arrayList = new ArrayList();
        this.f45161f = arrayList;
        this.f45164s = true;
        this.f45160c = c6Var;
        a1 a1Var = new a1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, c6Var);
        this.h = a1Var;
        a1Var.f45125o = 0.0f;
        a1Var.f45126p = 0.0f;
        a1Var.f45127q = 1.0f;
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
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f44841f == 0) {
            f fVar = (f) b1Var.f44838a;
            int i11 = i10 - this.e;
            ArrayList arrayList = this.f45161f;
            fVar.a((e) arrayList.get(i11));
            LimitPreviewView limitPreviewView = fVar.f45177c;
            limitPreviewView.F = ((e) arrayList.get(i11)).e;
            limitPreviewView.f23225c = this.f45162n;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        t3 t3Var;
        Context context = viewGroup.getContext();
        c6 c6Var = this.f45160c;
        if (i10 != 1) {
            if (i10 != 2) {
                ?? fVar = new f(context, c6Var);
                fVar.f45177c.setParentViewForGradien(this.f45163r);
                fVar.f45177c.setStaticGradinet(this.h);
                t3Var = fVar;
            } else {
                t3Var = new t3(context, 16);
            }
        } else if (this.f45164s) {
            ?? d61Var = new d61(context, 10);
            LinearLayout e = yh.e(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(b1.c(context.getDrawable(R.drawable.other_2x_large), b1.d().f45143a));
            e.addView(imageView, a6.a(28.0f, 0.0f, 0.0f, 8.0f, 0.0f, 40, 16));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.DoubledLimits));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(g6.w0(g6.G6, c6Var));
            textView.setTypeface(AndroidUtilities.bold());
            e.addView(textView, a6.e(-2, -2, 16));
            d61Var.addView(e, a6.e(-2, -2, 17));
            t3Var = d61Var;
        } else {
            t3Var = new t3(context, 64);
        }
        return k3.l(t3Var, t3Var, -1, -2);
    }
}
