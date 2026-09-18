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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.we;
import w7.x5;
public final class d {
    public final o2 f45102a;
    public final TLRPC.Chat f45103b;
    public final int f45104c;
    public FrameLayout d;
    public h0 e;
    public LinearLayout f45105f;
    public TextView f45106g;
    public ImageView h;
    public b f45107i;
    public TLRPC.ChatFull f45108j;
    public int f45109k;
    public int f45110l = -1;
    public c f45111m;

    public d(TLRPC.Chat chat, o2 o2Var) {
        this.f45102a = o2Var;
        this.f45103b = chat;
        this.f45104c = o2Var.getCurrentAccount();
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
                int i10 = this.f45110l;
                o2 o2Var = this.f45102a;
                TLRPC.Chat chat = this.f45103b;
                if (i10 == -1 && chat != null) {
                    this.f45110l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f18121id);
                }
                int i11 = this.f45109k;
                int i12 = this.f45110l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18121id, 0);
                    }
                } else {
                    return;
                }
            }
            c cVar = this.f45111m;
            if (cVar != null) {
                cVar.h(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.f45106g, 4, null, null, null, null, j6.fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.f18871de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            o2 o2Var = this.f45102a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final d f45100b;

                {
                    this.f45100b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45100b;
                            o2 o2Var2 = dVar.f45102a;
                            if (dVar.f45107i == null) {
                                dVar.f45107i = new b(dVar, o2Var2, dVar.f45103b.f18121id);
                            }
                            o2Var2.showDialog(dVar.f45107i);
                            return;
                        default:
                            d dVar2 = this.f45100b;
                            dVar2.f45102a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45103b.f18121id, dVar2.f45109k);
                            dVar2.f45110l = dVar2.f45109k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f45105f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f45105f, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            h0 h0Var = new h0(1, o2Var.getParentActivity(), false);
            this.e = h0Var;
            h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            h9 h9Var = this.e.f24900a;
            for (int i10 = 0; i10 < h9Var.f24584c.length; i10++) {
                h9Var.l(0, null, 0);
            }
            this.f45105f.addView(this.e, x5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.f45106g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f45106g.setGravity(16);
            this.f45106g.setSingleLine();
            this.f45106g.setText((CharSequence) null);
            this.f45106g.setTextColor(o2Var.getThemedColor(j6.fe));
            this.f45106g.setTypeface(AndroidUtilities.bold());
            this.f45105f.addView(this.f45106g, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(o2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(o2Var.getThemedColor(j6.f19229x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(o2Var.getThemedColor(j6.f18871de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final d f45100b;

                {
                    this.f45100b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d dVar = this.f45100b;
                            o2 o2Var2 = dVar.f45102a;
                            if (dVar.f45107i == null) {
                                dVar.f45107i = new b(dVar, o2Var2, dVar.f45103b.f18121id);
                            }
                            o2Var2.showDialog(dVar.f45107i);
                            return;
                        default:
                            d dVar2 = this.f45100b;
                            dVar2.f45102a.getMessagesController().setChatPendingRequestsOnClose(dVar2.f45103b.f18121id, dVar2.f45109k);
                            dVar2.f45110l = dVar2.f45109k;
                            dVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, x5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f45108j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(we weVar) {
        this.f45111m = weVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            o2 o2Var = this.f45102a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f45103b;
                if (chat != null) {
                    o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f18121id, 0);
                    this.f45110l = 0;
                }
                a(false, z10);
                this.f45109k = 0;
            } else if (this.f45109k != i10) {
                this.f45109k = i10;
                this.f45106g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.e.b(i11, user, this.f45104c);
                        }
                    }
                    this.e.setCount(min);
                    this.e.a(true);
                }
            }
        }
    }
}
