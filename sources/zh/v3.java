package zh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.gc1;
public final class v3 extends ul0 {
    public final ArrayList f48987c = new ArrayList();
    public final z3 d;

    public v3(z3 z3Var) {
        this.d = z3Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f48987c;
        arrayList.clear();
        z3 z3Var = this.d;
        y3 y3Var = z3Var.E;
        int i10 = 0;
        if (z3Var.Q) {
            arrayList.add(new r3(0));
            arrayList.add(new r3(6));
        } else {
            arrayList.add(new r3(0));
            if (y3Var != null) {
                m3 m3Var = y3Var.f49106s;
                boolean z10 = y3Var.f49097j;
                if (y3Var.b() <= 0 && (z10 || (!y3Var.e && !y3Var.f49100m))) {
                    if (!TextUtils.isEmpty(m3Var.f48685c)) {
                        arrayList.add(new r3(7));
                    } else if (z10) {
                        arrayList.add(new r3(5));
                    } else {
                        int i11 = y3Var.f49091a;
                        if (i11 > 0 && m3Var.f48684b) {
                            arrayList.add(new r3(8));
                        } else if (i11 > 0) {
                            arrayList.add(new r3(10));
                        } else {
                            arrayList.add(new r3(5));
                        }
                    }
                }
            }
            if (y3Var != null) {
                ArrayList arrayList2 = y3Var.f49095g;
                ArrayList arrayList3 = y3Var.f49096i;
                if (y3Var.f49094f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new r3((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new r3((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (y3Var != null && (y3Var.e || y3Var.f49100m)) {
                if (y3Var.b() <= 0) {
                    arrayList.add(new r3(6));
                } else {
                    arrayList.add(new r3(4));
                }
            } else if (y3Var != null && y3Var.f49098k) {
                arrayList.add(new r3(11));
            } else if (y3Var != null) {
                m3 m3Var2 = y3Var.f49106s;
                if (y3Var.b() < y3Var.f49091a && TextUtils.isEmpty(m3Var2.f48685c) && !m3Var2.f48684b) {
                    arrayList.add(new r3(12));
                }
            }
        }
        arrayList.add(new r3(9));
        l();
    }

    @Override
    public final int h() {
        return this.f48987c.size();
    }

    @Override
    public final int j(int i10) {
        return ((r3) this.f48987c.get(i10)).f48827a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        long j10;
        TL_stories.StoryItem storyItem;
        int i12;
        boolean z10;
        TLRPC.Reaction reaction;
        String str;
        long j11;
        boolean z11;
        int i13;
        int i14;
        TLRPC.Reaction reaction2;
        long j12;
        TL_stories.StoryItem storyItem2;
        int i15;
        boolean z12;
        float f7;
        String str2;
        TLRPC.Message message2;
        z3 z3Var = this.d;
        int i16 = z3Var.v;
        if (c1Var.f41613f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f48987c;
            if (i10 < arrayList.size()) {
                r3 r3Var = (r3) arrayList.get(i10);
                org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) c1Var.f41610a;
                TL_stories.StoryView storyView = r3Var.f48828b;
                TL_stories.StoryReaction storyReaction = r3Var.f48829c;
                if (storyView != null) {
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        peer = storyView.peer_id;
                    } else if ((storyView instanceof TL_stories.TL_storyViewPublicForward) && (message2 = storyView.message) != null) {
                        peer = message2.peer_id;
                    } else {
                        peer = new TLRPC.TL_peerUser();
                        peer.user_id = storyView.user_id;
                    }
                } else if (storyReaction != null) {
                    peer = storyReaction.peer_id;
                    if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                        peer = message.peer_id;
                    }
                } else {
                    peer = null;
                }
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (peerDialogId >= 0) {
                    user = MessagesController.getInstance(i16).getUser(Long.valueOf(peerDialogId));
                    j3 = peerDialogId;
                    chat = null;
                } else {
                    j3 = peerDialogId;
                    chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-peerDialogId));
                    user = null;
                }
                boolean remove = z3Var.F.f49103p.remove(Long.valueOf(j3));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = yg.p0.d(reaction3).f47101f) != null && str2.equals("❤")) {
                        j11 = 0;
                        z11 = true;
                    } else {
                        j11 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i13 = 11;
                        i14 = 12;
                        p6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i13 = 11;
                        i14 = 12;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j12 = message3.date;
                            } else {
                                j12 = j11;
                            }
                            f4 f4Var = z3Var.f49146y;
                            if (f4Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = f4Var.f48412a;
                            }
                            p6Var.c(user3, null, null, z11, j12, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            p6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((r3) arrayList.get(i10 + 1)).f48827a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i13 && i15 != i14) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    p6Var.f19676a = z12;
                    if (z3Var.d(storyView)) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    p6Var.a(f7, false);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = yg.p0.d(reaction4).f47101f) != null && str.equals("❤")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            reaction = null;
                        } else {
                            reaction = tL_storyReaction.reaction;
                        }
                        i11 = 12;
                        p6Var.c(user4, chat, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            p6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j10 = message4.date;
                            } else {
                                j10 = 0;
                            }
                            f4 f4Var2 = z3Var.f49146y;
                            if (f4Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = f4Var2.f48412a;
                            }
                            p6Var.c(user4, chat, null, false, j10, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((r3) arrayList.get(i10 + 1)).f48827a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    p6Var.f19676a = z13;
                    p6Var.a(1.0f, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        m90 m90Var;
        final z3 z3Var = this.d;
        int i12 = z3Var.v;
        b bVar = z3Var.f49143s;
        switch (i10) {
            case 0:
                m90Var = new t3(this, z3Var.getContext(), 0);
                break;
            case 1:
                jc0 jc0Var = org.telegram.ui.Cells.p6.G;
                m90Var = new u3(i12, z3Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                m90Var = new t3(this, z3Var.getContext(), 1);
                break;
            case 3:
                m90Var = new org.telegram.ui.Cells.s3(z3Var.getContext(), 70);
                break;
            case 4:
                a10 a10Var = new a10(z3Var.getContext(), bVar);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(28);
                a10Var.f21345w = false;
                m90Var = a10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (z3Var.F.f49097j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                hk hkVar = new hk(i11, z3Var.getContext(), bVar, this);
                uh.o oVar = hkVar.d;
                if (i10 == 7) {
                    oVar.setVisibility(8);
                    hkVar.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    oVar.setVisibility(8);
                    hkVar.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    oVar.setVisibility(0);
                    oVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    hkVar.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (z3Var.F.f49097j) {
                    oVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
                    m90 m90Var2 = hkVar.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        z3.a(z3Var);
                                        return;
                                    default:
                                        z3.a(z3Var);
                                        return;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        z3.a(z3Var);
                                        return;
                                    default:
                                        z3.a(z3Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) m90Var2.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(hkVar.getContext());
                        textView.setText(string);
                        int i13 = org.telegram.ui.ActionBar.j6.Sh;
                        org.telegram.ui.ActionBar.f6 f6Var = hkVar.f24513n;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        bi.l4 l4Var = new bi.l4(hkVar.getContext(), 18);
                        l4Var.setOnClickListener(new g80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), 30);
                        l4Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.c6.b(l4Var, 0.05f, 1.5f);
                        l4Var.addView(textView);
                        gc1 gc1Var = hkVar.f24509a;
                        gc1Var.setClipChildren(false);
                        gc1Var.addView(l4Var, w7.a6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    m90Var2.setText(spannableStringBuilder);
                } else {
                    oVar.setVisibility(0);
                    if (z3Var.F.f49094f) {
                        oVar.setText(LocaleController.getString(R.string.NoReactions));
                        hkVar.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        oVar.setText(LocaleController.getString(R.string.NoViews));
                        hkVar.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                hkVar.e(false, false);
                m90Var = hkVar;
                break;
            case 6:
                a10 a10Var2 = new a10(z3Var.getContext(), bVar);
                a10Var2.setIsSingleCell(true);
                a10Var2.setIgnoreHeightCheck(true);
                a10Var2.setItemsCount(20);
                a10Var2.setViewType(28);
                a10Var2.f21345w = false;
                m90Var = a10Var2;
                break;
            case 11:
            case 12:
                m90 m90Var3 = new m90(z3Var.getContext(), null);
                m90Var3.setTextSize(1, 13.0f);
                m90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, bVar));
                m90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                m90Var3.setPadding(dp3, dp2, dp3, dp2);
                m90Var3.setMaxLines(Integer.MAX_VALUE);
                m90Var3.setGravity(17);
                m90Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    m90Var3.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new xh.x(this, 26)));
                } else {
                    m90Var3.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                m90Var3.setLayoutParams(new s4.p0(-1, -2));
                m90Var = m90Var3;
                break;
        }
        return new s4.c1(m90Var);
    }
}
