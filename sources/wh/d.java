package wh;

import ai.h0;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.j9;
import org.telegram.ui.se;
import w7.y5;
public final class d {
    public final o2 f45398a;
    public final TLRPC.Chat f45399b;
    public final int f45400c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45401f;
    public TextView f45402g;
    public ImageView h;
    public b f45403i;
    public TLRPC.ChatFull f45404j;
    public int f45405k;
    public int f45406l = -1;
    public c f45407m;

    public d(TLRPC.Chat chat, o2 o2Var) {
        this.f45398a = o2Var;
        this.f45399b = chat;
        this.f45400c = o2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        if (this.d.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                int i10 = this.f45406l;
                o2 o2Var = this.f45398a;
                TLRPC.Chat chat = this.f45399b;
                if (i10 == -1 && chat != null) {
                    this.f45406l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18329id);
                }
                int i11 = this.f45405k;
                int i12 = this.f45406l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18329id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45407m;
            if (cVar != null) {
                cVar.h(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new k6(this.f45402g, 4, null, null, null, null, i6.fe));
        arrayList.add(new k6(this.h, 8, null, null, null, null, i6.f19065de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            o2 o2Var = this.f45398a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(i6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45396b;

                {
                    this.f45396b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45396b;
                            o2 o2Var2 = dVar.f45398a;
                            if (dVar.f45403i == null) {
                                dVar.f45403i = new b(dVar, o2Var2, dVar.f45399b.f18329id);
                            }
                            o2Var2.showDialog(dVar.f45403i);
                            return;
                        default:
                            d dVar2 = this.f45396b;
                            dVar2.f45398a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45399b.f18329id, dVar2.f45405k);
                            dVar2.f45406l = dVar2.f45405k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f45401f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45401f, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, o2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            j9 j9Var = this.e.f25679a;
            for (int i10 = 0; i10 < j9Var.f25389c.length; i10++) {
                j9Var.l(0, null, 0);
            }
            this.f45401f.addView(this.e, y5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.f45402g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45402g.setGravity(16);
            this.f45402g.setSingleLine();
            this.f45402g.setText((CharSequence) null);
            this.f45402g.setTextColor(o2Var.getThemedColor(i6.fe));
            this.f45402g.setTypeface(AndroidUtilities.bold());
            this.f45401f.addView(this.f45402g, y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(o2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(i6.f0(o2Var.getThemedColor(i6.f19426x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(o2Var.getThemedColor(i6.f19065de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45396b;

                {
                    this.f45396b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45396b;
                            o2 o2Var2 = dVar.f45398a;
                            if (dVar.f45403i == null) {
                                dVar.f45403i = new b(dVar, o2Var2, dVar.f45399b.f18329id);
                            }
                            o2Var2.showDialog(dVar.f45403i);
                            return;
                        default:
                            d dVar2 = this.f45396b;
                            dVar2.f45398a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45399b.f18329id, dVar2.f45405k);
                            dVar2.f45406l = dVar2.f45405k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, y5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45404j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(se seVar) {
        this.f45407m = seVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            o2 o2Var = this.f45398a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45399b;
                if (chat != null) {
                    o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18329id, 0);
                    this.f45406l = 0;
                }
                a(false, z10);
                this.f45405k = 0;
            } else if (this.f45405k != i10) {
                this.f45405k = i10;
                this.f45402g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45400c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
