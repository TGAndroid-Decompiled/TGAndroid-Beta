package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import di.l4;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
public final class g extends c implements p6 {
    public final ImageView f51778s;
    public f v;
    public TLRPC.Chat f51779w;
    public boolean f51780x;
    public int f51781y;

    public g(Context context, u6 u6Var) {
        super(context, u6Var);
        int i10;
        float f7;
        float f10;
        float f11;
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f51778s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = y6.x0(null, y6.Vh, false);
        this.f51781y = x02;
        imageView.setBackground(y6.g0(x02, 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        f7.t(imageView, y6.f23518m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i11 = i10 | 17;
        if (z10) {
            f7 = 3.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 3.0f;
        }
        addView(imageView, gb1.h(48, 50.0f, i11, f7, 0.0f, f10, 0.0f));
        l4 l4Var = this.d;
        if (LocaleController.isRTL) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        l4Var.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z10, int i11) {
        String str;
        int i12;
        String string;
        String str2;
        this.f51780x = z10;
        this.f51779w = chat;
        j9 j9Var = this.f51759b;
        j9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.f51760c;
        y9Var.setRoundRadius(dp);
        y9Var.f(chat, j9Var);
        String str3 = chat.title;
        l4 l4Var = this.d;
        l4Var.k(Emoji.replaceEmoji(str3, l4Var.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z10) {
            if (i11 >= 1) {
                if (isChannelAndNotMegaGroup) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                string = LocaleController.formatPluralString(str2, i11, new Object[0]);
            } else {
                if (isChannelAndNotMegaGroup) {
                    i12 = R.string.DiscussChannel;
                } else {
                    i12 = R.string.AccDescrGroup;
                }
                string = LocaleController.getString(i12);
            }
            setSubtitle(string);
        } else {
            if (isChannelAndNotMegaGroup) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(LocaleController.formatPluralString(str, i10, new Object[0]));
        }
        f7.Y(this.e, y6.f23612r5, this.f51758a);
        setDivider(true);
        ImageView imageView = this.f51778s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new org.telegram.ui.web.c(9, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f51779w;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f51778s.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.v = fVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = y6.x0(null, y6.Vh, false);
            ImageView imageView = this.f51778s;
            if (imageView != null && x02 != this.f51781y) {
                this.f51781y = x02;
                y6.E1(imageView.getBackground(), x02, true);
                imageView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
