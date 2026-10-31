package th;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.u71;
public final class u3 extends sk0 {
    public final ArrayList f49513c = new ArrayList();
    public final y3 d;

    public u3(y3 y3Var) {
        this.d = y3Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f49513c;
        arrayList.clear();
        y3 y3Var = this.d;
        x3 x3Var = y3Var.E;
        int i10 = 0;
        if (y3Var.Q) {
            arrayList.add(new q3(0));
            arrayList.add(new q3(6));
        } else {
            arrayList.add(new q3(0));
            if (x3Var != null) {
                l3 l3Var = x3Var.f49630s;
                boolean z10 = x3Var.f49621j;
                if (x3Var.b() <= 0 && (z10 || (!x3Var.e && !x3Var.f49624m))) {
                    if (!TextUtils.isEmpty(l3Var.f49169c)) {
                        arrayList.add(new q3(7));
                    } else if (z10) {
                        arrayList.add(new q3(5));
                    } else {
                        int i11 = x3Var.f49615a;
                        if (i11 > 0 && l3Var.f49168b) {
                            arrayList.add(new q3(8));
                        } else if (i11 > 0) {
                            arrayList.add(new q3(10));
                        } else {
                            arrayList.add(new q3(5));
                        }
                    }
                }
            }
            if (x3Var != null) {
                ArrayList arrayList2 = x3Var.f49619g;
                ArrayList arrayList3 = x3Var.f49620i;
                if (x3Var.f49618f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new q3((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new q3((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (x3Var != null && (x3Var.e || x3Var.f49624m)) {
                if (x3Var.b() <= 0) {
                    arrayList.add(new q3(6));
                } else {
                    arrayList.add(new q3(4));
                }
            } else if (x3Var != null && x3Var.f49622k) {
                arrayList.add(new q3(11));
            } else if (x3Var != null) {
                l3 l3Var2 = x3Var.f49630s;
                if (x3Var.b() < x3Var.f49615a && TextUtils.isEmpty(l3Var2.f49169c) && !l3Var2.f49168b) {
                    arrayList.add(new q3(12));
                }
            }
        }
        arrayList.add(new q3(9));
        f();
    }

    @Override
    public final int b() {
        return this.f49513c.size();
    }

    @Override
    public final int d(int i10) {
        return ((q3) this.f49513c.get(i10)).f49385a;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat L0;
        TLRPC.User user;
        int i11;
        long j11;
        TL_stories.StoryItem storyItem;
        int i12;
        boolean z10;
        TLRPC.Reaction reaction;
        String str;
        long j12;
        boolean z11;
        int i13;
        int i14;
        TLRPC.Reaction reaction2;
        long j13;
        TL_stories.StoryItem storyItem2;
        int i15;
        boolean z12;
        float f7;
        String str2;
        TLRPC.Message message2;
        y3 y3Var = this.d;
        int i16 = y3Var.f49677w;
        if (c1Var.f47901f == 1 && i10 >= 0) {
            ArrayList arrayList = this.f49513c;
            if (i10 < arrayList.size()) {
                q3 q3Var = (q3) arrayList.get(i10);
                org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) c1Var.f47898a;
                TL_stories.StoryView storyView = q3Var.f49386b;
                TL_stories.StoryReaction storyReaction = q3Var.f49387c;
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
                long o10 = org.telegram.messenger.o5.o(peer);
                if (o10 >= 0) {
                    user = vp.r1(i16).Z1(Long.valueOf(o10));
                    j10 = o10;
                    L0 = null;
                } else {
                    j10 = o10;
                    L0 = vp.r1(i16).L0(Long.valueOf(-o10));
                    user = null;
                }
                boolean remove = y3Var.F.f49627p.remove(Long.valueOf(j10));
                if (storyView != null) {
                    TLRPC.Reaction reaction3 = storyView.reaction;
                    if (reaction3 != null && (str2 = sg.o0.d(reaction3).f48434f) != null && str2.equals("❤")) {
                        j12 = 0;
                        z11 = true;
                    } else {
                        j12 = 0;
                        z11 = false;
                    }
                    if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                        TLRPC.User user2 = user;
                        i14 = 11;
                        i13 = 12;
                        q6Var.c(user2, null, null, z11, 0L, storyView.story, false, true, remove);
                    } else {
                        TLRPC.User user3 = user;
                        i13 = 12;
                        i14 = 11;
                        if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                            TLRPC.Message message3 = storyView.message;
                            if (message3 != null) {
                                j13 = message3.date;
                            } else {
                                j13 = j12;
                            }
                            e4 e4Var = y3Var.D;
                            if (e4Var == null) {
                                storyItem2 = null;
                            } else {
                                storyItem2 = e4Var.f48902a;
                            }
                            q6Var.c(user3, null, null, z11, j13, storyItem2, true, true, remove);
                        } else {
                            if (z11) {
                                reaction2 = null;
                            } else {
                                reaction2 = storyView.reaction;
                            }
                            q6Var.c(user3, null, reaction2, z11, storyView.date, null, false, true, remove);
                        }
                    }
                    if (i10 < arrayList.size() - 1) {
                        i15 = ((q3) arrayList.get(i10 + 1)).f49385a;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != 1 && i15 != i14 && i15 != i13) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    q6Var.f22834a = z12;
                    if (y3Var.d(storyView)) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    q6Var.a(false, f7);
                    return;
                }
                TLRPC.User user4 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction4 = tL_storyReaction.reaction;
                        if (reaction4 != null && (str = sg.o0.d(reaction4).f48434f) != null && str.equals("❤")) {
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
                        q6Var.c(user4, L0, reaction, z10, tL_storyReaction.date, null, false, true, remove);
                    } else {
                        i11 = 12;
                        if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                            q6Var.c(user4, L0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                        } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                            TLRPC.Message message4 = storyReaction.message;
                            if (message4 != null) {
                                j11 = message4.date;
                            } else {
                                j11 = 0;
                            }
                            e4 e4Var2 = y3Var.D;
                            if (e4Var2 == null) {
                                storyItem = null;
                            } else {
                                storyItem = e4Var2.f48902a;
                            }
                            q6Var.c(user4, L0, null, false, j11, storyItem, true, true, remove);
                        }
                    }
                    boolean z13 = true;
                    if (i10 < arrayList.size() - 1) {
                        i12 = ((q3) arrayList.get(i10 + 1)).f49385a;
                    } else {
                        i12 = -1;
                    }
                    if (i12 != 1 && i12 != 11 && i12 != i11) {
                        z13 = false;
                    }
                    q6Var.f22834a = z13;
                    q6Var.a(false, 1.0f);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11;
        p80 p80Var;
        final y3 y3Var = this.d;
        int i12 = y3Var.f49677w;
        b bVar = y3Var.f49676s;
        switch (i10) {
            case 0:
                p80Var = new s3(this, y3Var.getContext(), 0);
                break;
            case 1:
                hb0 hb0Var = org.telegram.ui.Cells.q6.H;
                p80Var = new t3(i12, y3Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                p80Var = new s3(this, y3Var.getContext(), 1);
                break;
            case 3:
                p80Var = new org.telegram.ui.Cells.x3(y3Var.getContext(), 70);
                break;
            case 4:
                zz zzVar = new zz(y3Var.getContext(), bVar);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(28);
                zzVar.f33274x = false;
                p80Var = zzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                if (y3Var.F.f49621j) {
                    i11 = 12;
                } else if (i10 != 10 && i10 != 7 && i10 != 8 && i10 != 5) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                kj kjVar = new kj(i11, y3Var.getContext(), bVar, this);
                nh.p pVar = kjVar.d;
                if (i10 == 7) {
                    pVar.setVisibility(8);
                    kjVar.setSubtitle(cd.L0(2131748183, null));
                } else if (i10 == 8) {
                    pVar.setVisibility(8);
                    kjVar.setSubtitle(cd.L0(2131748239, null));
                } else if (i10 == 10) {
                    pVar.setVisibility(0);
                    pVar.setText(cd.L0(2131745579, null));
                    kjVar.setSubtitle(cd.L0(2131745581, null));
                } else if (y3Var.F.f49621j) {
                    pVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.L0(2131750872, null)));
                    boolean A3 = vp.r1(i12).A3();
                    p80 p80Var2 = kjVar.e;
                    if (!A3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.T2(cd.L0(2131750871, null), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        y3.a(y3Var);
                                        return;
                                    default:
                                        y3.a(y3Var);
                                        return;
                                }
                            }
                        }));
                        String L0 = cd.L0(2131749020, null);
                        Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        y3.a(y3Var);
                                        return;
                                    default:
                                        y3.a(y3Var);
                                        return;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) p80Var2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(12.0f);
                        TextView textView = new TextView(kjVar.getContext());
                        textView.setText(L0);
                        int i13 = org.telegram.ui.ActionBar.t6.Gi;
                        org.telegram.ui.ActionBar.p6 p6Var = kjVar.f25553n;
                        org.telegram.ui.ActionBar.a7.V(textView, i13, p6Var);
                        textView.setPadding(org.telegram.messenger.i0.L(45.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(45.0f), org.telegram.messenger.i0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        textView.setTextSize(1, 15.0f);
                        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(kjVar.getContext(), 24);
                        a5Var.setOnClickListener(new db0(runnable, 16));
                        int L = org.telegram.messenger.i0.L(8.0f);
                        int i14 = org.telegram.ui.ActionBar.t6.Ci;
                        int w02 = org.telegram.ui.ActionBar.t6.w0(i14, p6Var);
                        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, o10, o10);
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
                        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i13, 30);
                        a5Var.setBackground(k02);
                        org.telegram.ui.ActionBar.a7.k(a5Var, k02, N, h, p6Var);
                        w7.e6.b(a5Var, 0.05f, 1.5f);
                        a5Var.addView(textView);
                        u71 u71Var = kjVar.f25549a;
                        u71Var.setClipChildren(false);
                        u71Var.addView(a5Var, w7.b6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    p80Var2.setText(spannableStringBuilder);
                } else {
                    pVar.setVisibility(0);
                    if (y3Var.F.f49618f) {
                        pVar.setText(cd.L0(2131748191, null));
                        kjVar.setSubtitle(cd.L0(2131748189, null));
                    } else {
                        pVar.setText(cd.L0(2131748148, null));
                        kjVar.setSubtitle(cd.L0(2131748147, null));
                    }
                }
                kjVar.e(false, false);
                p80Var = kjVar;
                break;
            case 6:
                zz zzVar2 = new zz(y3Var.getContext(), bVar);
                zzVar2.setIsSingleCell(true);
                zzVar2.setIgnoreHeightCheck(true);
                zzVar2.setItemsCount(20);
                zzVar2.setViewType(28);
                zzVar2.f33274x = false;
                p80Var = zzVar2;
                break;
            case 11:
            case 12:
                p80 p80Var3 = new p80(y3Var.getContext(), null);
                p80Var3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.a7.V(p80Var3, org.telegram.ui.ActionBar.t6.f21311y6, bVar);
                org.telegram.ui.ActionBar.a7.H(p80Var3, org.telegram.ui.ActionBar.t6.J6, bVar);
                int L2 = org.telegram.messenger.i0.L(16.0f);
                int L3 = org.telegram.messenger.i0.L(21.0f);
                p80Var3.setPadding(L3, L2, L3, L2);
                p80Var3.setMaxLines(Integer.MAX_VALUE);
                p80Var3.setGravity(17);
                p80Var3.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    p80Var3.setText(org.telegram.messenger.i0.T2(cd.L0(2131744472, null), new sg.v(this, 10)));
                } else {
                    p80Var3.setText(cd.L0(2131745580, null));
                }
                p80Var3.setLayoutParams(new s4.o0(-1, -2));
                p80Var = p80Var3;
                break;
        }
        return new s4.c1(p80Var);
    }
}
