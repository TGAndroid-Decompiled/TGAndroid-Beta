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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.j9;
import org.telegram.ui.re;
import w7.z5;
public final class d {
    public final n2 f49092a;
    public final TLRPC.Chat f49093b;
    public final int f49094c;
    public FrameLayout d;
    public h0 f49095e;
    public LinearLayout f49096f;
    public TextView f49097g;
    public ImageView h;
    public b f49098i;
    public TLRPC.ChatFull f49099j;
    public int f49100k;
    public int f49101l = -1;
    public c f49102m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.f49092a = n2Var;
        this.f49093b = chat;
        this.f49094c = n2Var.getCurrentAccount();
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
                int i10 = this.f49101l;
                n2 n2Var = this.f49092a;
                TLRPC.Chat chat = this.f49093b;
                if (i10 == -1 && chat != null) {
                    this.f49101l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f20037id);
                }
                int i11 = this.f49100k;
                int i12 = this.f49101l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20037id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f49102m;
            if (cVar != null) {
                cVar.e(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new k6(this.f49097g, 4, null, null, null, null, i6.fe));
        arrayList.add(new k6(this.h, 8, null, null, null, null, i6.f20825de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.f49092a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(i6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f49090b;

                {
                    this.f49090b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49090b;
                            n2 n2Var2 = dVar.f49092a;
                            if (dVar.f49098i == null) {
                                dVar.f49098i = new b(dVar, n2Var2, dVar.f49093b.f20037id);
                            }
                            n2Var2.showDialog(dVar.f49098i);
                            return;
                        default:
                            d dVar2 = this.f49090b;
                            dVar2.f49092a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49093b.f20037id, dVar2.f49100k);
                            dVar2.f49101l = dVar2.f49100k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f49096f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f49096f, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, n2Var.getParentActivity(), false);
            this.f49095e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            j9 j9Var = this.f49095e.f28025a;
            for (int i10 = 0; i10 < j9Var.f27662c.length; i10++) {
                j9Var.l(0, null, 0);
            }
            this.f49096f.addView(this.f49095e, z5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.f49097g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f49097g.setGravity(16);
            this.f49097g.setSingleLine();
            this.f49097g.setText((CharSequence) null);
            this.f49097g.setTextColor(n2Var.getThemedColor(i6.fe));
            this.f49097g.setTypeface(AndroidUtilities.bold());
            this.f49096f.addView(this.f49097g, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(i6.f0(n2Var.getThemedColor(i6.f21188x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(i6.f20825de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f49090b;

                {
                    this.f49090b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f49090b;
                            n2 n2Var2 = dVar.f49092a;
                            if (dVar.f49098i == null) {
                                dVar.f49098i = new b(dVar, n2Var2, dVar.f49093b.f20037id);
                            }
                            n2Var2.showDialog(dVar.f49098i);
                            return;
                        default:
                            d dVar2 = this.f49090b;
                            dVar2.f49092a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f49093b.f20037id, dVar2.f49100k);
                            dVar2.f49101l = dVar2.f49100k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, z5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f49099j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(re reVar) {
        this.f49102m = reVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            n2 n2Var = this.f49092a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f49093b;
                if (chat != null) {
                    n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20037id, 0);
                    this.f49101l = 0;
                }
                a(false, z10);
                this.f49100k = 0;
            } else if (this.f49100k != i10) {
                this.f49100k = i10;
                this.f49097g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.f49095e.b(i11, user, this.f49094c);
                        }
                    }
                    this.f49095e.setCount(min);
                    this.f49095e.a(true);
                }
            }
        }
    }
}
