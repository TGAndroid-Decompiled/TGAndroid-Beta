package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u61 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean A0;
    public h61 B0;
    public th.x4 C0;
    public g61 D;
    public int D0;
    public g61 E;
    public final m4 E0;
    public g61 F;
    public xa.n F0;
    public q61 G;
    public PorterDuffColorFilter G0;
    public g61 H;
    public int H0;
    public g61 I;
    public g61 J;
    public g61 K;
    public g61 L;
    public g61 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.sn R;
    public u51 S;
    public s4.a0 T;
    public final e2.j0 U;
    public org.telegram.ui.Components.ei0 V;
    public z51 W;
    public v51 X;
    public t61 Y;
    public bg.h Z;
    public TLRPC.ChatFull f42023a;
    public LinearLayout f42024a0;
    public final long f42025b;
    public final boolean f42026b0;
    public boolean f42027c;
    public final boolean f42028c0;
    public g61 d;
    public final boolean f42029d0;
    public g61 e;
    public long f42030e0;
    public p61 f42031f;
    public long f42032f0;
    public final org.telegram.ui.ActionBar.x1[] f42033g0;
    public g61 h;
    public s51 f42034h0;
    public zb f42035i0;
    public le f42036j0;
    public View f42037k0;
    public FrameLayout f42038l0;
    public fe.b m0;
    public g61 f42039n;
    public final boolean f42040n0;
    public rf0 f42041o0;
    public FrameLayout f42042p0;
    public gh.b[] f42043q0;
    public g61 f42044r;
    public int f42045r0;
    public g61 f42046s;
    public final SparseIntArray f42047s0;
    public final SparseIntArray f42048t0;
    public final ArrayList f42049u0;
    public final ArrayList f42050v0;
    public g61 f42051w;
    public final ArrayList f42052w0;
    public g61 f42053x;
    public final ArrayList f42054x0;
    public g61 f42055y;
    public final ArrayList f42056y0;
    public boolean f42057z0;

    public u61(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new e2.j0(50, 3);
        this.f42033g0 = new org.telegram.ui.ActionBar.x1[1];
        this.f42045r0 = -1;
        this.f42047s0 = new SparseIntArray();
        this.f42048t0 = new SparseIntArray();
        this.f42049u0 = new ArrayList();
        this.f42050v0 = new ArrayList();
        this.f42052w0 = new ArrayList();
        this.f42054x0 = new ArrayList();
        this.f42056y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new m4(this, 15);
        long j10 = bundle.getLong("chat_id");
        this.f42025b = j10;
        this.f42026b0 = bundle.getBoolean("is_megagroup", false);
        this.f42028c0 = bundle.getBoolean("start_from_boosts", false);
        this.f42029d0 = bundle.getBoolean("start_from_monetization", false);
        this.f42040n0 = bundle.getBoolean("only_boosts", false);
        this.f42023a = getMessagesController().M0(j10);
    }

    public static void Y(u61 u61Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        float abs5;
        int i10;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        String str10;
        ArrayList arrayList4;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList5 = u61Var.N;
        ArrayList arrayList6 = u61Var.O;
        ArrayList arrayList7 = u61Var.f42049u0;
        String str18 = "%";
        int i11 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final g61[] g61VarArr = {h0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.cd.L0(2131749282, "IVInteractionsChartTitle"), 1, false), h0(tL_broadcastStats.followers_graph, org.telegram.messenger.cd.L0(2131750611, "FollowersChartTitle"), 0, false), h0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.cd.L0(2131744058, "TopHoursChartTitle"), 0, false), h0(tL_broadcastStats.interactions_graph, org.telegram.messenger.cd.L0(2131743556, "ViewsAndSharesChartTitle"), 1, false), h0(tL_broadcastStats.growth_graph, org.telegram.messenger.cd.L0(2131749384, "GrowthChartTitle"), 0, false), h0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.cd.L0(2131743555, "ViewsBySourceChartTitle"), 2, false), h0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.cd.L0(2131748291, "NewFollowersBySourceChartTitle"), 2, false), h0(tL_broadcastStats.languages_graph, org.telegram.messenger.cd.L0(2131749051, "LanguagesChartTitle"), 4, true), h0(tL_broadcastStats.mute_graph, org.telegram.messenger.cd.L0(2131747936, "NotificationsChartTitle"), 0, false), h0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.cd.L0(2131746400, "ReactionsByEmotionChartTitle"), 2, false), h0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.cd.L0(2131744678, "StoryInteractionsChartTitle"), 1, false), h0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.cd.L0(2131744530, "StoryReactionsByEmotionChartTitle"), 2, false)};
            g61 g61Var = g61VarArr[2];
            if (g61Var != null) {
                g61Var.f37443n = true;
            }
            ?? obj = new Object();
            xa.n a2 = p61.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            obj.f40488o = org.telegram.messenger.cd.L0(2131746393, "ReactionsPerPost");
            obj.f40489p = (String) a2.f53554a;
            obj.f40490q = (String) a2.d;
            obj.f40491r = ((Boolean) a2.f53555b).booleanValue();
            obj.f40492s = ((Boolean) a2.f53556c).booleanValue();
            xa.n a10 = p61.a(tL_broadcastStats.reactions_per_story);
            obj.f40493t = org.telegram.messenger.cd.L0(2131746392, "ReactionsPerStory");
            obj.f40494u = (String) a10.f53554a;
            obj.v = (String) a10.d;
            obj.f40495w = ((Boolean) a10.f53555b).booleanValue();
            obj.f40496x = ((Boolean) a10.f53556c).booleanValue();
            xa.n a11 = p61.a(tL_broadcastStats.views_per_story);
            obj.f40497y = org.telegram.messenger.cd.L0(2131743553, "ViewsPerStory");
            obj.f40498z = (String) a11.f53554a;
            obj.A = (String) a11.d;
            obj.B = ((Boolean) a11.f53555b).booleanValue();
            obj.C = ((Boolean) a11.f53556c).booleanValue();
            xa.n a12 = p61.a(tL_broadcastStats.shares_per_story);
            obj.D = org.telegram.messenger.cd.L0(2131745415, "SharesPerStory");
            obj.E = (String) a12.f53554a;
            obj.F = (String) a12.d;
            obj.G = ((Boolean) a12.f53555b).booleanValue();
            obj.H = ((Boolean) a12.f53556c).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str19 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i12 / ((float) d10)) * 100.0f);
            }
            obj.f40477a = org.telegram.messenger.cd.L0(2131750611, "FollowersChartTitle");
            obj.f40478b = org.telegram.messenger.i0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f40479c = "";
            } else {
                int i13 = (int) abs5;
                if (abs5 == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i12 <= 0) {
                        str17 = "";
                    } else {
                        str17 = str4;
                    }
                    sb2.append(str17);
                    sb2.append(org.telegram.messenger.i0.o0(i12, 0));
                    obj.f40479c = sb2.toString() + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    if (i12 <= 0) {
                        str16 = "";
                    } else {
                        str16 = str4;
                    }
                    sb3.append(str16);
                    sb3.append(org.telegram.messenger.i0.o0(i12, 0));
                    i10 = i12;
                    obj.f40479c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i14 / ((float) d12)) * 100.0f);
            }
            obj.f40482i = org.telegram.messenger.cd.L0(2131745416, "SharesPerPost");
            obj.f40483j = org.telegram.messenger.i0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 != 0 && abs6 != 0.0f) {
                int i15 = (int) abs6;
                if (abs6 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i14 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str4;
                    }
                    sb4.append(str15);
                    sb4.append(org.telegram.messenger.i0.o0(i14, 0));
                    obj.f40484k = sb4.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i14 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str4;
                    }
                    sb5.append(str14);
                    sb5.append(org.telegram.messenger.i0.o0(i14, 0));
                    obj.f40484k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f40484k = "";
            }
            if (i14 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f40485l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.e = org.telegram.messenger.cd.L0(2131743554, "ViewsPerPost");
            obj.f40480f = org.telegram.messenger.i0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 != 0 && abs7 != 0.0f) {
                int i17 = (int) abs7;
                if (abs7 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    if (i16 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str4;
                    }
                    sb6.append(str13);
                    sb6.append(org.telegram.messenger.i0.o0(i16, 0));
                    obj.f40481g = sb6.toString() + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i16 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str4;
                    }
                    sb7.append(str12);
                    sb7.append(org.telegram.messenger.i0.o0(i16, 0));
                    obj.f40481g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f40481g = "";
            }
            if (i16 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f40486m = org.telegram.messenger.cd.L0(2131751144, "EnabledNotifications");
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f40487n = a1.g.k(i18, "%");
            } else {
                obj.f40487n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            u61Var.f42031f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            u61Var.f42030e0 = tL_statsDateRangeDays.max_date * 1000;
            u61Var.f42032f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                i21++;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f41149a = postInteractionCounters2;
                int i22 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str10 = str19;
                    str11 = str18;
                    u61Var.f42047s0.put(obj2.b(), i19);
                    i19++;
                } else {
                    str10 = str19;
                    arrayList4 = arrayList8;
                    str11 = str18;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    u61Var.f42052w0.add(obj2);
                    u61Var.f42048t0.put(obj2.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str19 = str10;
                str18 = str11;
                arrayList8 = arrayList4;
                size = i22;
            }
            str3 = str19;
            ArrayList arrayList12 = arrayList8;
            str2 = str18;
            org.telegram.messenger.i0.g3(new o51(u61Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((r61) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.hs messagesStorage = u61Var.getMessagesStorage();
                int i23 = u61Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.f15938a.c(new org.telegram.messenger.bq(messagesStorage, org.telegram.messenger.l00.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -u61Var.f42025b, 0L, size2, b10, 0, 0, i23, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            org.telegram.messenger.i0.g3(new Runnable(u61Var) {
                public final u61 f40471b;

                {
                    this.f40471b = u61Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            u61 u61Var2 = this.f40471b;
                            u61Var2.getClass();
                            g61[] g61VarArr2 = g61VarArr;
                            u61Var2.f42044r = g61VarArr2[0];
                            u61Var2.h = g61VarArr2[1];
                            u61Var2.e = g61VarArr2[2];
                            u61Var2.f42039n = g61VarArr2[3];
                            u61Var2.d = g61VarArr2[4];
                            u61Var2.f42046s = g61VarArr2[5];
                            u61Var2.f42051w = g61VarArr2[6];
                            u61Var2.f42053x = g61VarArr2[7];
                            u61Var2.f42055y = g61VarArr2[8];
                            u61Var2.D = g61VarArr2[9];
                            u61Var2.E = g61VarArr2[10];
                            u61Var2.F = g61VarArr2[11];
                            u61Var2.i0(g61VarArr2);
                            return;
                        default:
                            u61 u61Var3 = this.f40471b;
                            u61Var3.getClass();
                            g61[] g61VarArr3 = g61VarArr;
                            u61Var3.d = g61VarArr3[0];
                            u61Var3.H = g61VarArr3[1];
                            u61Var3.I = g61VarArr3[2];
                            u61Var3.J = g61VarArr3[3];
                            u61Var3.K = g61VarArr3[4];
                            u61Var3.L = g61VarArr3[5];
                            u61Var3.e = g61VarArr3[6];
                            u61Var3.M = g61VarArr3[7];
                            u61Var3.i0(g61VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "TopHoursChartTitle";
            str2 = "%";
            str3 = "GrowthChartTitle";
            str4 = "+";
            r15 = 0;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            g61 h02 = h0(tL_megagroupStats.growth_graph, org.telegram.messenger.cd.L0(2131749384, str3), r15, r15);
            g61 h03 = h0(tL_megagroupStats.members_graph, org.telegram.messenger.cd.L0(2131749436, "GroupMembersChartTitle"), r15, r15);
            g61 h04 = h0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.cd.L0(2131748288, "NewMembersBySourceChartTitle"), 2, r15);
            g61 h05 = h0(tL_megagroupStats.languages_graph, org.telegram.messenger.cd.L0(2131748633, "MembersLanguageChartTitle"), 4, true);
            g61 h06 = h0(tL_megagroupStats.messages_graph, org.telegram.messenger.cd.L0(2131748477, "MessagesChartTitle"), 2, r15);
            g61 h07 = h0(tL_megagroupStats.actions_graph, org.telegram.messenger.cd.L0(2131754489, "ActionsChartTitle"), 1, r15);
            g61 h08 = h0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.cd.L0(2131744058, str), r15, r15);
            g61 h09 = h0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.cd.L0(2131744059, "TopDaysOfWeekChartTitle"), 4, r15);
            final g61[] g61VarArr2 = new g61[8];
            g61VarArr2[r15] = h02;
            g61VarArr2[1] = h03;
            g61VarArr2[2] = h04;
            g61VarArr2[3] = h05;
            g61VarArr2[4] = h06;
            g61VarArr2[5] = h07;
            g61VarArr2[6] = h08;
            g61VarArr2[7] = h09;
            g61 g61Var2 = g61VarArr2[6];
            if (g61Var2 != null) {
                g61Var2.f37443n = true;
            }
            g61 g61Var3 = g61VarArr2[7];
            if (g61Var3 != null) {
                g61Var3.f37444o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i24 / ((float) d16)) * 100.0f);
            }
            obj3.f40877a = org.telegram.messenger.cd.L0(2131748632, "MembersOverviewTitle");
            obj3.f40878b = org.telegram.messenger.i0.o0((int) tL_megagroupStats.members.current, 0);
            if (i24 != 0 && abs != 0.0f) {
                int i25 = (int) abs;
                if (abs == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i24 <= 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    sb8.append(str9);
                    sb8.append(org.telegram.messenger.i0.o0(i24, 0));
                    obj3.f40879c = sb8.toString() + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    if (i24 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str4;
                    }
                    sb9.append(str8);
                    sb9.append(org.telegram.messenger.i0.o0(i24, 0));
                    obj3.f40879c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str2);
                }
            } else {
                obj3.f40879c = "";
            }
            if (i24 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i26 / ((float) d18)) * 100.0f);
            }
            obj3.f40882i = org.telegram.messenger.cd.L0(2131743558, "ViewingMembers");
            obj3.f40883j = org.telegram.messenger.i0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i26 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                if (i26 <= 0) {
                    str7 = "";
                } else {
                    str7 = str4;
                }
                sb10.append(str7);
                sb10.append(org.telegram.messenger.i0.o0(i26, 0));
                obj3.f40884k = sb10.toString();
            } else {
                obj3.f40884k = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f40885l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f40886m = org.telegram.messenger.cd.L0(2131747082, "PostingMembers");
            obj3.f40887n = org.telegram.messenger.i0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i27 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                if (i27 <= 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                sb11.append(str6);
                sb11.append(org.telegram.messenger.i0.o0(i27, 0));
                obj3.f40888o = sb11.toString();
            } else {
                obj3.f40888o = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f40889p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.e = org.telegram.messenger.cd.L0(2131748468, "MessagesOverview");
            obj3.f40880f = org.telegram.messenger.i0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i28 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                if (i28 <= 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                sb12.append(str5);
                sb12.append(org.telegram.messenger.i0.o0(i28, 0));
                obj3.f40881g = sb12.toString();
            } else {
                obj3.f40881g = "";
            }
            if (i28 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            u61Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            u61Var.f42030e0 = tL_statsDateRangeDays2.max_date * 1000;
            u61Var.f42032f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f39841a = n61.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb13.append(org.telegram.messenger.cd.G(i30, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.cd.a0("CharactersPerMessage", null, 2131752254, org.telegram.messenger.cd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    obj4.f39842b = sb13.toString();
                    int i31 = i11;
                    if (arrayList2.size() < i31) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i29++;
                    arrayList2 = arrayList3;
                    i11 = i31;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i32 = 0; i32 < tL_megagroupStats.top_admins.size(); i32++) {
                    ArrayList arrayList19 = u61Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i32);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f39841a = n61.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i33 = tL_statsGroupTopAdmin.deleted;
                    if (i33 > 0) {
                        sb14.append(org.telegram.messenger.cd.G(i33, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.cd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.cd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    obj5.f39842b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i34 = 0; i34 < tL_megagroupStats.top_inviters.size(); i34++) {
                    ArrayList arrayList22 = u61Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i34);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f39841a = n61.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i35 = tL_statsGroupTopInviter.invitations;
                    if (i35 > 0) {
                        obj6.f39842b = org.telegram.messenger.cd.G(i35, "Invitations", new Object[0]);
                    } else {
                        obj6.f39842b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            org.telegram.messenger.i0.g3(new Runnable(u61Var) {
                public final u61 f40471b;

                {
                    this.f40471b = u61Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            u61 u61Var2 = this.f40471b;
                            u61Var2.getClass();
                            g61[] g61VarArr22 = g61VarArr2;
                            u61Var2.f42044r = g61VarArr22[0];
                            u61Var2.h = g61VarArr22[1];
                            u61Var2.e = g61VarArr22[2];
                            u61Var2.f42039n = g61VarArr22[3];
                            u61Var2.d = g61VarArr22[4];
                            u61Var2.f42046s = g61VarArr22[5];
                            u61Var2.f42051w = g61VarArr22[6];
                            u61Var2.f42053x = g61VarArr22[7];
                            u61Var2.f42055y = g61VarArr22[8];
                            u61Var2.D = g61VarArr22[9];
                            u61Var2.E = g61VarArr22[10];
                            u61Var2.F = g61VarArr22[11];
                            u61Var2.i0(g61VarArr22);
                            return;
                        default:
                            u61 u61Var3 = this.f40471b;
                            u61Var3.getClass();
                            g61[] g61VarArr3 = g61VarArr2;
                            u61Var3.d = g61VarArr3[0];
                            u61Var3.H = g61VarArr3[1];
                            u61Var3.I = g61VarArr3[2];
                            u61Var3.J = g61VarArr3[3];
                            u61Var3.K = g61VarArr3[4];
                            u61Var3.L = g61VarArr3[5];
                            u61Var3.e = g61VarArr3[6];
                            u61Var3.M = g61VarArr3[7];
                            u61Var3.i0(g61VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void Z(u61 u61Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new org.telegram.messenger.jj(u61Var.currentAccount, arrayList2.get(i10), false, true));
            }
            u61Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.i0.g3(new o51(u61Var, arrayList, 1));
    }

    public static void b0(u61 u61Var) {
        t61 t61Var = u61Var.Y;
        if (t61Var != null) {
            t61Var.f41746b = true;
        }
        int childCount = u61Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u61Var.S.getChildAt(i10);
            if (childAt instanceof f61) {
                ((f61) childAt).f36960b.f2739t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.k2 f0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f19793id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).M0(chat.f19793id);
        if (M0 != null && (M0.can_view_stats || M0.can_view_stars_revenue)) {
            return new u61(bundle);
        }
        return new t5(-chat.f19793id);
    }

    public static cg.b g0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new cg.b(jSONObject);
        }
        if (i10 == 1) {
            return new cg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new cg.b(jSONObject);
            int length = ((cg.a) bVar.d.get(0)).f4158a.length;
            int size = bVar.d.size();
            bVar.f4173l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f4173l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f4173l;
                    jArr[i11] = jArr[i11] + ((cg.a) bVar.d.get(i12)).f4158a[i11];
                }
            }
            bVar.f4174m = new m4.c(bVar.f4173l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new cg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f4164a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j11 = ((cg.a) bVar2.d.get(i13)).f4158a[i14];
                        jArr2[i13] = jArr2[i13] + j11;
                        if (j11 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j10 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j10 < 0.01d && iArr[i15] > bVar2.f4164a.length / 2.0f) {
                        arrayList.add((cg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((cg.a) obj);
                }
            }
            int length3 = ((cg.a) bVar2.d.get(0)).f4158a.length;
            int size3 = bVar2.d.size();
            bVar2.f4175l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f4175l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f4175l;
                    jArr3[i17] = jArr3[i17] + ((cg.a) bVar2.d.get(i18)).f4158a[i17];
                }
            }
            new m4.c(bVar2.f4175l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static g61 h0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        g61 g61Var = new g61(str, i10);
        g61Var.f37442m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                cg.b g02 = g0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                g61Var.d = g02;
                if (g02 != null) {
                    g02.h = statsGraph.rate;
                }
                g61Var.f37437g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (g02 == null || (jArr2 = g02.f4164a) == null || jArr2.length < 2) {
                    g61Var.f37441l = true;
                }
                if (i10 == 4 && g02 != null && (jArr = g02.f4164a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    g61Var.e = new cg.e(g02, j10);
                    g61Var.f37435c = j10;
                    return g61Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            g61Var.f37436f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return g61Var;
    }

    public static void m0(g61 g61Var, ArrayList arrayList, org.telegram.ui.ActionBar.b7 b7Var) {
        cg.b bVar;
        int i10;
        if (g61Var != null && (bVar = g61Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                cg.a aVar = (cg.a) obj;
                int i12 = aVar.f4162g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.t6.f1(i12)) {
                        int i13 = aVar.f4162g;
                        if (org.telegram.ui.ActionBar.t6.I == org.telegram.ui.ActionBar.t6.J) {
                            i10 = aVar.f4163i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.t6.A1(i13, i10, false);
                        org.telegram.ui.ActionBar.t6.em[aVar.f4162g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, aVar.f4162g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21259v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21242u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21295x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21001h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Oj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21037j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        int i10;
        boolean z12;
        int i11;
        String str;
        int i12;
        boolean z13;
        u61 u61Var = this;
        u61Var.setHasOwnBackground(true);
        u61Var.Z = new bg.h((org.telegram.ui.ActionBar.p6) null);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(u61Var.currentAccount);
        long j10 = u61Var.f42025b;
        TLRPC.Chat L0 = r12.L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(u61Var.currentAccount).M0(j10);
        if (M0 != null && M0.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean R = org.telegram.messenger.w3.R(L0);
        if (M0 != null && (M0.can_view_revenue || M0.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(gh.b.c(context, u61Var.resourceProvider, gh.a.I, 2131744910));
        }
        arrayList.add(gh.b.c(context, u61Var.resourceProvider, gh.a.O, 2131753163));
        if (z11) {
            arrayList.add(gh.b.c(context, u61Var.resourceProvider, gh.a.P, 2131748422));
        }
        u61Var.f42043q0 = (gh.b[]) arrayList.toArray(new gh.b[0]);
        rf0 rf0Var = new rf0(context, u61Var.resourceProvider);
        u61Var.f42041o0 = rf0Var;
        rf0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        u61Var.f42041o0.setMaxWidth(org.telegram.messenger.i0.L(344.0f));
        u61Var.f42041o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        u61Var.f42042p0 = frameLayout2;
        frameLayout2.setOnClickListener(new bh.c(17));
        u61Var.f42042p0.addView(u61Var.f42041o0, w7.b6.e(-1, 72, 81));
        u61Var.f42042p0.setClipToPadding(false);
        int i13 = 0;
        while (true) {
            gh.b[] bVarArr = u61Var.f42043q0;
            if (i13 >= bVarArr.length) {
                break;
            }
            gh.b bVar = bVarArr[i13];
            bVar.setOnClickListener(new bh.f(u61Var, i13, 26));
            u61Var.f42041o0.addView(u61Var.f42043q0[i13]);
            u61Var.f42041o0.i(bVar, true, false);
            i13++;
        }
        u61Var.f42034h0 = new s51(u61Var, u61Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            zb zbVar = new zb(u61Var, -j10, u61Var.getResourceProvider());
            u61Var.f42035i0 = zbVar;
            zbVar.F.setCaptureSectionsDecoratorAllowed(true);
            u61Var.glassEngine.b(u61Var.f42035i0.F);
        }
        if (z11) {
            Activity parentActivity = u61Var.getParentActivity();
            int i14 = u61Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.p6 resourceProvider = u61Var.getResourceProvider();
            frameLayout = frameLayout3;
            ei.r rVar = u61Var.glassEngine;
            if (org.telegram.messenger.w3.V(L0) && M0.can_view_revenue) {
                i12 = -1;
                z13 = true;
            } else {
                i12 = -1;
                z13 = false;
            }
            i10 = i12;
            le leVar = new le(parentActivity, u61Var, i14, j11, resourceProvider, rVar, z13, M0.can_view_stars_revenue);
            u61Var = u61Var;
            u61Var.f42036j0 = leVar;
            leVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i10 = -1;
        }
        boolean z14 = z10;
        FrameLayout frameLayout4 = frameLayout;
        u61Var.f42034h0.setAdapter(new t51(u61Var, z14, R, z11, frameLayout4));
        boolean z15 = u61Var.f42040n0;
        if (R && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        u61Var.f42027c = z12;
        if (z12 && u61Var.f42028c0) {
            u61Var.f42034h0.setPosition(z14 ? 1 : 0);
        } else if (z12 && u61Var.f42029d0) {
            s51 s51Var = u61Var.f42034h0;
            if (!z15 && R) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            s51Var.setPosition(i11 + (z14 ? 1 : 0));
        }
        u61Var.o0(u61Var.f42034h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(u61Var.getParentActivity());
        frameLayout5.addView(u61Var.f42034h0, w7.b6.g());
        View view = new View(context);
        u61Var.f42037k0 = view;
        frameLayout5.addView(view, w7.b6.e(i10, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        u61Var.f42038l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(u61Var.f42038l0, w7.b6.g());
        frameLayout5.addView(u61Var.simpleActionBar);
        if (u61Var.f42027c) {
            u61Var.setBulletinDelegate(new mg.u(9));
            u61Var.f42042p0.setBackground(u61Var.getBaseSimpleGlass().b(u61Var.f42042p0));
            frameLayout5.addView(u61Var.f42042p0, w7.b6.e(i10, -2, 80));
        }
        u61Var.fragmentView = frameLayout5;
        u51 u51Var = new u51(u61Var, context);
        u61Var.S = u51Var;
        u51Var.setCaptureSectionsDecoratorAllowed(true);
        u61Var.S.setSections(true);
        u61Var.S.setClipToPadding(false);
        u61Var.glassEngine.b(u61Var.S);
        u61Var.S.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        u61Var.f42024a0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        u61Var.V = imageView;
        imageView.setAutoRepeat(true);
        u61Var.V.f(2131624226, 120, 120, null);
        u61Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i15 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(textView, i15, null);
        textView.setTag(Integer.valueOf(i15));
        textView.setText(org.telegram.messenger.cd.L0(2131748787, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i16 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.V(textView2, i16, null);
        textView2.setTag(Integer.valueOf(i16));
        textView2.setText(org.telegram.messenger.cd.L0(2131748786, null));
        textView2.setGravity(1);
        u61Var.f42024a0.addView(u61Var.V, w7.b6.t(120, 120, 1, 0, 0, 0, 20));
        u61Var.f42024a0.addView(textView, w7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        u61Var.f42024a0.addView(textView2, w7.b6.r(-2, -2, 1));
        frameLayout4.addView(u61Var.f42024a0, w7.b6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (u61Var.W == null) {
            u61Var.W = new z51(u61Var);
        }
        u61Var.S.setAdapter(u61Var.W);
        s4.a0 a0Var = new s4.a0();
        u61Var.T = a0Var;
        u61Var.S.setLayoutManager(a0Var);
        u61Var.X = new s4.j();
        u61Var.S.setItemAnimator(null);
        u61Var.S.j(new w41(u61Var, 1));
        u61Var.S.setOnItemClickListener(new kz0(u61Var, 6));
        u61Var.S.setOnItemLongClickListener(new r51(u61Var));
        frameLayout4.addView(u61Var.S);
        u61Var.R = new org.telegram.ui.Components.sn(context, null, false, null);
        TLRPC.Chat L02 = u61Var.getMessagesController().L0(Long.valueOf(j10));
        u61Var.R.setChatAvatar(L02);
        u61Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        org.telegram.ui.ActionBar.i5 i5Var = u61Var.simpleActionBar;
        if (L02 == null) {
            str = "";
        } else {
            str = L02.title;
        }
        i5Var.setTitle(str);
        u61Var.simpleActionBar.setActionBarMenuOnItemClick(new y01(u61Var, 3));
        u61Var.R.i(org.telegram.ui.ActionBar.t6.x0(null, i15, false), org.telegram.ui.ActionBar.t6.x0(null, i16, false));
        boolean z16 = u61Var.A0;
        m4 m4Var = u61Var.E0;
        if (z16) {
            u61Var.f42024a0.setAlpha(0.0f);
            org.telegram.messenger.i0.h3(m4Var, 500L);
            u61Var.f42024a0.setVisibility(0);
            u61Var.S.setVisibility(8);
        } else {
            org.telegram.messenger.i0.r(m4Var);
            u61Var.f42024a0.setVisibility(8);
            u61Var.S.setVisibility(0);
        }
        vg.f c10 = u61Var.getBaseSimpleGlass().f6599c.c(u61Var.f42041o0, w7.b9.f(u61Var.resourceProvider), false);
        org.telegram.messenger.z20.u(c10, org.telegram.messenger.i0.L(28.0f), 7.666f);
        u61Var.f42041o0.setBackground(c10);
        u61Var.glassEngine.c(u61Var.f42034h0);
        ei.b baseSimpleGlass = u61Var.getBaseSimpleGlass();
        s51 s51Var2 = u61Var.f42034h0;
        org.telegram.ui.ActionBar.i5 i5Var2 = u61Var.simpleActionBar;
        org.telegram.ui.ActionBar.p6 p6Var = u61Var.resourceProvider;
        baseSimpleGlass.f6604k = frameLayout5;
        baseSimpleGlass.f6605l = s51Var2;
        baseSimpleGlass.f6597a.c(s51Var2);
        baseSimpleGlass.g(frameLayout5, i5Var2, p6Var);
        u61Var.m0 = new fe.b(0, new r51(u61Var), org.telegram.ui.Components.gr.h, 380L, false);
        le leVar2 = u61Var.f42036j0;
        if (leVar2 != null) {
            ei.b baseSimpleGlass2 = u61Var.getBaseSimpleGlass();
            View view2 = leVar2.f39192a1.d;
            vg.f c11 = baseSimpleGlass2.f6599c.c(view2, null, false);
            c11.o(w7.b9.m(leVar2.f39204n0));
            c11.p(org.telegram.messenger.i0.L(9.66f));
            c11.q(org.telegram.messenger.i0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = u61Var.f42036j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.i0.E2(transactionTabs);
            u61Var.f42038l0.addView(transactionTabs, layoutParams);
            u61Var.f42036j0.setTabsPinnedChangedListener(new wv0(u61Var, 22));
            u61Var.m0.a(u61Var.f42036j0.f27914e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new bl(u61Var, 2));
        u61Var.getBaseSimpleGlass().f6606m = new yv(u61Var, frameLayout5, new z5(1, frameLayout5), 1);
        u61Var.getBaseSimpleGlass().f6605l = null;
        u61Var.simpleActionBar.setBackground(null);
        u61Var.f42037k0.setBackground(u61Var.getBaseSimpleGlass().a(u61Var.f42037k0));
        org.telegram.messenger.i0.E2(u61Var.R.e);
        frameLayout5.addView(u61Var.R.e, w7.b6.e(42, 42, 53));
        u61Var.e0();
        u61Var.fragmentView.setBackgroundColor(u61Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
        u61Var.B0 = new h61(u61Var.W, u61Var.T);
        return u61Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k2 k2Var;
        org.telegram.ui.ActionBar.k2 k2Var2;
        org.telegram.ui.ActionBar.k2 k2Var3 = null;
        int i12 = 0;
        if (i10 == org.telegram.messenger.zs.f19723x5) {
            if (((th.x4) objArr[0]) == this.C0) {
                l0();
                q0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                }
            }
        } else if (i10 == org.telegram.messenger.zs.V2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    k2Var = (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack);
                } else {
                    k2Var = null;
                }
                if (k2Var instanceof oo) {
                    ((ActionBarLayout) getParentLayout()).c0(k2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    k2Var2 = (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack2);
                } else {
                    k2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        k2Var3 = (org.telegram.ui.ActionBar.k2) sc.e.g(3, fragmentStack2);
                    }
                    if (k2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).c0(k2Var2, false);
                    }
                    finishFragment();
                    if (k2Var3 instanceof un) {
                        mg.p.f(k2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (k2Var2 instanceof ProfileActivity) {
                    mg.p.f(k2Var2, chat, false);
                }
            }
        } else if (i10 == org.telegram.messenger.zs.D) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f42049u0;
                    if (i13 >= size) {
                        break;
                    }
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i13);
                    int i14 = this.f42047s0.get(jjVar.f1(), -1);
                    if (i14 >= 0 && ((r61) arrayList.get(i14)).b() == jjVar.f1()) {
                        if (jjVar.Z) {
                            arrayList3.add((r61) arrayList.get(i14));
                        } else {
                            ((r61) arrayList.get(i14)).f41150b = jjVar;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f42050v0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    r61 r61Var = (r61) arrayList.get(i12);
                    if (r61Var.f41150b == null) {
                        this.f42045r0 = r61Var.b();
                        break;
                    } else {
                        arrayList4.add(r61Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    j0();
                }
                q0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                }
            }
        } else if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19794id == this.f42025b && this.f42023a == null) {
                this.f42023a = chatFull;
                k0();
            }
        }
    }

    public final void e0() {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.f42037k0 != null) {
            int L = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f7766b;
            ViewGroup.LayoutParams layoutParams = this.f42037k0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.f42037k0.setLayoutParams(layoutParams);
            }
            s0();
        }
        if (this.f42027c) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        org.telegram.messenger.i0.A3(this.R.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.f7766b, org.telegram.messenger.i0.L(6.0f), 0);
        this.f42042p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        u51 u51Var = this.S;
        if (u51Var != null) {
            i0.c cVar = this.mSystemInsets;
            ei.b.e(u51Var, cVar.f7766b, cVar.d, currentActionBarHeight, i10);
        }
        zb zbVar = this.f42035i0;
        if (zbVar != null) {
            org.telegram.ui.Components.tk0 tk0Var = zbVar.F;
            i0.c cVar2 = this.mSystemInsets;
            ei.b.e(tk0Var, cVar2.f7766b, cVar2.d, currentActionBarHeight, i10);
        }
        le leVar = this.f42036j0;
        if (leVar != null) {
            i0.c cVar3 = this.mSystemInsets;
            int i11 = cVar3.f7766b;
            int i12 = cVar3.d;
            leVar.U0 = i11;
            leVar.V0 = i12;
            leVar.W0 = i10;
            int C = org.telegram.messenger.z20.C(48.0f, i11, -org.telegram.messenger.i0.L(8.0f));
            int C2 = org.telegram.messenger.z20.C(48.0f, i12, -org.telegram.messenger.i0.L(8.0f));
            org.telegram.ui.Components.u51 u51Var2 = leVar.X0;
            org.telegram.messenger.i0.A3(u51Var2, 0, C, 0, C2);
            u51Var2.setPadding(u51Var2.getPaddingLeft(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11) - C, u51Var2.getPaddingRight(), (i12 + i10) - C2);
            leVar.z(-C, -C2);
            leVar.B();
            leVar.requestLayout();
            leVar.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        g61 g61Var;
        g61 g61Var2;
        g6 g6Var = new g6(21, this);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{dg.d.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21037j5));
        if (this.f42026b0) {
            while (i10 < 6) {
                if (i10 == 0) {
                    g61Var2 = this.d;
                } else if (i10 == 1) {
                    g61Var2 = this.H;
                } else if (i10 == 2) {
                    g61Var2 = this.I;
                } else if (i10 == 3) {
                    g61Var2 = this.J;
                } else if (i10 == 4) {
                    g61Var2 = this.K;
                } else {
                    g61Var2 = this.L;
                }
                m0(g61Var2, arrayList, g6Var);
                i10++;
            }
        } else {
            while (i10 < 12) {
                if (i10 == 0) {
                    g61Var = this.d;
                } else if (i10 == 1) {
                    g61Var = this.h;
                } else if (i10 == 2) {
                    g61Var = this.f42039n;
                } else if (i10 == 3) {
                    g61Var = this.f42044r;
                } else if (i10 == 4) {
                    g61Var = this.f42046s;
                } else if (i10 == 5) {
                    g61Var = this.f42051w;
                } else if (i10 == 6) {
                    g61Var = this.f42055y;
                } else if (i10 == 7) {
                    g61Var = this.e;
                } else if (i10 == 8) {
                    g61Var = this.f42053x;
                } else if (i10 == 9) {
                    g61Var = this.D;
                } else if (i10 == 10) {
                    g61Var = this.E;
                } else {
                    g61Var = this.F;
                }
                m0(g61Var, arrayList, g6Var);
                i10++;
            }
        }
        return arrayList;
    }

    public final void i0(g61[] g61VarArr) {
        z51 z51Var = this.W;
        if (z51Var != null) {
            z51Var.E();
            this.S.setItemAnimator(null);
            this.W.f();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.f42024a0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            org.telegram.messenger.i0.r(this.E0);
            this.f42024a0.animate().alpha(0.0f).setDuration(230L).setListener(new ns0(this, 9));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (g61 g61Var : g61VarArr) {
                if (g61Var != null && g61Var.d == null && g61Var.f37436f != null) {
                    g61Var.a(this.currentAccount, this.classGuid, this.f42023a.stats_dc, new uh(2, this, g61Var));
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        s51 s51Var;
        if (motionEvent != null && this.f42036j0 != null && (s51Var = this.f42034h0) != null) {
            View currentView = s51Var.getCurrentView();
            le leVar = this.f42036j0;
            if (currentView == leVar && leVar.G((motionEvent.getX() - this.f42034h0.getX()) - this.f42036j0.getX(), (motionEvent.getY() - this.f42034h0.getY()) - this.f42036j0.getY())) {
                return false;
            }
        }
        s51 s51Var2 = this.f42034h0;
        if (s51Var2 != null && (s51Var2.f32090b != 0 || s51Var2.f32091c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f19831id = new ArrayList<>();
        ArrayList arrayList = this.f42049u0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f42047s0.get(this.f42045r0); i11 < size; i11++) {
            if (((r61) arrayList.get(i11)).f41150b == null) {
                tL_channels_getMessages.f19831id.add(Integer.valueOf(((r61) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(this.f42025b);
        this.f42057z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new n51(this, 0));
    }

    public final void k0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f42040n0) {
            return;
        }
        boolean z10 = this.f42026b0;
        long j10 = this.f42025b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.vp.r1(this.currentAccount).g1(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new n51(this, 1), null, null, 0, this.f42023a.stats_dc, 1, true), this.classGuid);
    }

    public final void l0() {
        ArrayList arrayList = this.f42054x0;
        arrayList.clear();
        ArrayList arrayList2 = this.f42052w0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            r61 r61Var = (r61) obj;
            org.telegram.messenger.jj f7 = this.C0.f(r61Var.b());
            if (f7 != null) {
                r61Var.f41150b = f7;
                arrayList.add(r61Var);
            }
        }
        this.f42048t0.clear();
        arrayList2.clear();
    }

    public final void n0(View view) {
        if (view instanceof f61) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.c7) && !this.S.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.eq) {
                org.telegram.ui.Components.eq eqVar = (org.telegram.ui.Components.eq) background;
                if ((eqVar.f25839a instanceof ColorDrawable) && eqVar.f25840b != null) {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20892b7, false);
                    if (this.G0 == null || this.H0 != x02) {
                        this.H0 = x02;
                        this.G0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) eqVar.f25839a).setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false));
                    eqVar.f25840b.setColorFilter(this.G0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false)), org.telegram.ui.ActionBar.t6.Y0(org.telegram.messenger.w0.f19025b, 2131231230, org.telegram.ui.ActionBar.t6.f20892b7), 0, 0);
            eqVar2.f25847x = true;
            view.setBackground(eqVar2);
        } else if (view instanceof dg.d) {
            ((dg.d) view).a();
        }
    }

    public final void o0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            gh.b[] bVarArr = this.f42043q0;
            if (i11 < bVarArr.length) {
                gh.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        xa.n nVar = this.F0;
        if (nVar != null) {
            nVar.a();
            this.F0 = null;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar2 = new xa.n(notificationCenter, this);
        nVar2.e(org.telegram.messenger.zs.D);
        nVar2.e(org.telegram.messenger.zs.T);
        nVar2.e(org.telegram.messenger.zs.V2);
        nVar2.e(org.telegram.messenger.zs.f19723x5);
        this.F0 = nVar2;
        th.e5 O1 = getMessagesController().O1();
        long j10 = this.f42025b;
        th.x4 A = O1.A(2, -1, -j10, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.f42023a != null) {
            k0();
        } else {
            org.telegram.messenger.vp.r1(this.currentAccount).T2(this.classGuid, j10, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        xa.n nVar = this.F0;
        if (nVar != null) {
            nVar.a();
            this.F0 = null;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.f42033g0;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
            x1VarArr[0] = null;
        }
        th.x4 x4Var = this.C0;
        if (x4Var != null) {
            x4Var.z(this.D0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        e0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.sn snVar = this.R;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Cj, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dj, false));
            }
            r0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(boolean z10, float f7) {
        for (int i10 = 0; i10 < this.f42043q0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            gh.b bVar = this.f42043q0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.f42041o0.invalidate();
    }

    public final void q0() {
        ArrayList arrayList = this.f42056y0;
        arrayList.clear();
        arrayList.addAll(this.f42050v0);
        arrayList.addAll(this.f42054x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.messenger.uk(4))));
    }

    public final void r0() {
        u51 u51Var = this.S;
        if (u51Var != null) {
            int childCount = u51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                n0(this.S.getChildAt(i10));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                n0(this.S.V(i11));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                n0(this.S.P(i12));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                n0(this.S.O(i13));
            }
            this.S.getRecycledViewPool().a();
        }
        bg.h hVar = this.Z;
        if (hVar != null) {
            hVar.f2686c = true;
        }
    }

    public final void s0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u61.s0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
