package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ra1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final y5 B0;
    public NotificationCenter.ObserversGroup C0;
    public da1 E;
    public da1 F;
    public na1 G;
    public da1 H;
    public da1 I;
    public da1 J;
    public da1 K;
    public da1 L;
    public da1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.go R;
    public r91 S;
    public s4.c0 T;
    public final LruCache U;
    public org.telegram.ui.Components.nj0 V;
    public w91 W;
    public s91 X;
    public qa1 Y;
    public ig.f Z;
    public TLRPC.ChatFull f37054a;
    public LinearLayout f37055a0;
    public final long f37056b;
    public final boolean f37057b0;
    public boolean f37058c;
    public final boolean f37059c0;
    public da1 d;
    public final boolean f37060d0;
    public da1 e;
    public long f37061e0;
    public ma1 f37062f;
    public long f37063f0;
    public final org.telegram.ui.ActionBar.c2[] f37064g0;
    public da1 h;
    public ci.i1 f37065h0;
    public dc f37066i0;
    public me f37067j0;
    public final boolean f37068k0;
    public dh0 f37069l0;
    public FrameLayout m0;
    public da1 f37070n;
    public oh.b[] f37071n0;
    public int f37072o0;
    public final SparseIntArray f37073p0;
    public final SparseIntArray f37074q0;
    public da1 f37075r;
    public final ArrayList f37076r0;
    public da1 f37077s;
    public final ArrayList f37078s0;
    public final ArrayList f37079t0;
    public final ArrayList f37080u0;
    public da1 v;
    public final ArrayList f37081v0;
    public da1 f37082w;
    public boolean f37083w0;
    public da1 f37084x;
    public boolean f37085x0;
    public da1 f37086y;
    public ea1 f37087y0;
    public ai.d9 f37088z0;

    public ra1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new LruCache(50);
        this.f37064g0 = new org.telegram.ui.ActionBar.c2[1];
        this.f37072o0 = -1;
        this.f37073p0 = new SparseIntArray();
        this.f37074q0 = new SparseIntArray();
        this.f37076r0 = new ArrayList();
        this.f37078s0 = new ArrayList();
        this.f37079t0 = new ArrayList();
        this.f37080u0 = new ArrayList();
        this.f37081v0 = new ArrayList();
        this.f37085x0 = true;
        this.B0 = new y5(this, 13);
        long j3 = bundle.getLong("chat_id");
        this.f37056b = j3;
        this.f37057b0 = bundle.getBoolean("is_megagroup", false);
        this.f37059c0 = bundle.getBoolean("start_from_boosts", false);
        this.f37060d0 = bundle.getBoolean("start_from_monetization", false);
        this.f37068k0 = bundle.getBoolean("only_boosts", false);
        this.f37054a = getMessagesController().getChatFull(j3);
    }

    public static void U(ra1 ra1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i10;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        int i11;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = ra1Var.N;
        ArrayList arrayList6 = ra1Var.O;
        ArrayList arrayList7 = ra1Var.f37076r0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final da1[] da1VarArr = {d0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), d0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), d0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), d0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), d0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), d0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), d0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), d0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), d0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), d0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), d0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), d0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            da1 da1Var = da1VarArr[2];
            if (da1Var != null) {
                da1Var.f32916n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.t a2 = ma1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f35606o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f35607p = (String) a2.f7336b;
            obj.f35608q = (String) a2.e;
            obj.f35609r = ((Boolean) a2.f7337c).booleanValue();
            obj.f35610s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.t a10 = ma1.a(tL_broadcastStats.reactions_per_story);
            obj.f35611t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f35612u = (String) a10.f7336b;
            obj.v = (String) a10.e;
            obj.f35613w = ((Boolean) a10.f7337c).booleanValue();
            obj.f35614x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.t a11 = ma1.a(tL_broadcastStats.views_per_story);
            obj.f35615y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f35616z = (String) a11.f7336b;
            obj.A = (String) a11.e;
            obj.B = ((Boolean) a11.f7337c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.t a12 = ma1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7336b;
            obj.F = (String) a12.e;
            obj.G = ((Boolean) a12.f7337c).booleanValue();
            obj.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i12 / ((float) d10)) * 100.0f);
            }
            obj.f35595a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f35596b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f35597c = "";
            } else {
                int i13 = (int) abs5;
                if (abs5 == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i12 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    String sb3 = sb2.toString();
                    obj.f35597c = sb3 + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i12 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb4.append(str14);
                    sb4.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    obj.f35597c = String.format(locale2, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs5), "%");
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
            obj.f35600i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f35601j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 != 0 && abs6 != 0.0f) {
                int i15 = (int) abs6;
                if (abs6 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i14 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb5.append(str13);
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    String sb6 = sb5.toString();
                    obj.f35602k = sb6 + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i14 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb7.append(str12);
                    sb7.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    obj.f35602k = String.format(locale4, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f35602k = "";
            }
            if (i14 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f35603l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f35598f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 != 0 && abs7 != 0.0f) {
                int i17 = (int) abs7;
                if (abs7 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i16 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb8.append(str11);
                    sb8.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    String sb9 = sb8.toString();
                    obj.f35599g = sb9 + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb10 = new StringBuilder();
                    if (i16 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb10.append(str10);
                    sb10.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    obj.f35599g = String.format(locale6, "%s (%.1f%s)", sb10.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f35599g = "";
            }
            if (i16 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f35604m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f35605n = a4.a.m(i18, "%");
            } else {
                obj.f35605n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            ra1Var.f37062f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            ra1Var.f37061e0 = tL_statsDateRangeDays.max_date * 1000;
            ra1Var.f37063f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f36172a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    ra1Var.f37073p0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    ra1Var.f37079t0.add(obj2);
                    ra1Var.f37074q0.put(obj2.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new n91(ra1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                ra1Var.getMessagesStorage().getMessages(-ra1Var.f37056b, 0L, false, arrayList12.size(), ((oa1) arrayList12.get(0)).b(), 0, 0, ra1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(ra1Var) {
                public final ra1 f35565b;

                {
                    this.f35565b = ra1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ra1 ra1Var2 = this.f35565b;
                            ra1Var2.getClass();
                            da1[] da1VarArr2 = da1VarArr;
                            ra1Var2.d = da1VarArr2[0];
                            ra1Var2.H = da1VarArr2[1];
                            ra1Var2.I = da1VarArr2[2];
                            ra1Var2.J = da1VarArr2[3];
                            ra1Var2.K = da1VarArr2[4];
                            ra1Var2.L = da1VarArr2[5];
                            ra1Var2.e = da1VarArr2[6];
                            ra1Var2.M = da1VarArr2[7];
                            ra1Var2.e0(da1VarArr2);
                            return;
                        default:
                            ra1 ra1Var3 = this.f35565b;
                            ra1Var3.getClass();
                            da1[] da1VarArr3 = da1VarArr;
                            ra1Var3.f37075r = da1VarArr3[0];
                            ra1Var3.h = da1VarArr3[1];
                            ra1Var3.e = da1VarArr3[2];
                            ra1Var3.f37070n = da1VarArr3[3];
                            ra1Var3.d = da1VarArr3[4];
                            ra1Var3.f37077s = da1VarArr3[5];
                            ra1Var3.v = da1VarArr3[6];
                            ra1Var3.f37082w = da1VarArr3[7];
                            ra1Var3.f37084x = da1VarArr3[8];
                            ra1Var3.f37086y = da1VarArr3[9];
                            ra1Var3.E = da1VarArr3[10];
                            ra1Var3.F = da1VarArr3[11];
                            ra1Var3.e0(da1VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final da1[] da1VarArr2 = {d0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), d0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), d0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), d0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), d0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), d0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), d0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), d0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            da1 da1Var2 = da1VarArr2[6];
            if (da1Var2 != null) {
                da1Var2.f32916n = true;
            }
            da1 da1Var3 = da1VarArr2[7];
            if (da1Var3 != null) {
                da1Var3.f32917o = true;
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
            obj3.f35910a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f35911b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 != 0 && abs != 0.0f) {
                int i25 = (int) abs;
                if (abs == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb11 = new StringBuilder();
                    if (i24 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb11.append(str8);
                    sb11.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    String sb12 = sb11.toString();
                    obj3.f35912c = sb12 + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb13 = new StringBuilder();
                    if (i24 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb13.append(str7);
                    sb13.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    obj3.f35912c = String.format(locale9, "%s (%.1f%s)", sb13.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f35912c = "";
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
            obj3.f35915i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f35916j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb14 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb14.append(str6);
                sb14.append(AndroidUtilities.formatWholeNumber(i26, 0));
                String sb15 = sb14.toString();
                obj3.f35917k = sb15;
            } else {
                obj3.f35917k = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f35918l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f35919m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f35920n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb16 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb16.append(str5);
                sb16.append(AndroidUtilities.formatWholeNumber(i27, 0));
                String sb17 = sb16.toString();
                obj3.f35921o = sb17;
            } else {
                obj3.f35921o = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f35922p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f35913f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb18 = new StringBuilder();
                if (i28 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb18.append(str4);
                sb18.append(AndroidUtilities.formatWholeNumber(i28, 0));
                String sb19 = sb18.toString();
                obj3.f35914g = sb19;
            } else {
                obj3.f35914g = "";
            }
            if (i28 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            ra1Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            ra1Var.f37061e0 = tL_statsDateRangeDays2.max_date * 1000;
            ra1Var.f37063f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f34987a = ka1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb20 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb20.append(LocaleController.formatPluralString("messages", i30, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f34988b = sb20.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i29++;
                    arrayList2 = arrayList3;
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
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = ra1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f34987a = ka1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb21 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb21.append(LocaleController.formatPluralString("Deletions", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f34988b = sb21.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = ra1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f34987a = ka1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f34988b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f34988b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(ra1Var) {
                public final ra1 f35565b;

                {
                    this.f35565b = ra1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ra1 ra1Var2 = this.f35565b;
                            ra1Var2.getClass();
                            da1[] da1VarArr22 = da1VarArr2;
                            ra1Var2.d = da1VarArr22[0];
                            ra1Var2.H = da1VarArr22[1];
                            ra1Var2.I = da1VarArr22[2];
                            ra1Var2.J = da1VarArr22[3];
                            ra1Var2.K = da1VarArr22[4];
                            ra1Var2.L = da1VarArr22[5];
                            ra1Var2.e = da1VarArr22[6];
                            ra1Var2.M = da1VarArr22[7];
                            ra1Var2.e0(da1VarArr22);
                            return;
                        default:
                            ra1 ra1Var3 = this.f35565b;
                            ra1Var3.getClass();
                            da1[] da1VarArr3 = da1VarArr2;
                            ra1Var3.f37075r = da1VarArr3[0];
                            ra1Var3.h = da1VarArr3[1];
                            ra1Var3.e = da1VarArr3[2];
                            ra1Var3.f37070n = da1VarArr3[3];
                            ra1Var3.d = da1VarArr3[4];
                            ra1Var3.f37077s = da1VarArr3[5];
                            ra1Var3.v = da1VarArr3[6];
                            ra1Var3.f37082w = da1VarArr3[7];
                            ra1Var3.f37084x = da1VarArr3[8];
                            ra1Var3.f37086y = da1VarArr3[9];
                            ra1Var3.E = da1VarArr3[10];
                            ra1Var3.F = da1VarArr3[11];
                            ra1Var3.e0(da1VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void V(ra1 ra1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(ra1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            ra1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new n91(ra1Var, arrayList, 0));
    }

    public static void X(ra1 ra1Var) {
        qa1 qa1Var = ra1Var.Y;
        if (qa1Var != null) {
            qa1Var.f36700b = true;
        }
        int childCount = ra1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ra1Var.S.getChildAt(i10);
            if (childAt instanceof ca1) {
                ((ca1) childAt).f32302b.f11155t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 b0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f18329id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18329id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new ra1(bundle);
        }
        return new x5(-chat.f18329id);
    }

    public static jg.b c0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new jg.b(jSONObject);
        }
        if (i10 == 1) {
            return new jg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new jg.b(jSONObject);
            int length = ((jg.a) bVar.d.get(0)).f12987a.length;
            int size = bVar.d.size();
            bVar.f13002l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f13002l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f13002l;
                    jArr[i11] = jArr[i11] + ((jg.a) bVar.d.get(i12)).f12987a[i11];
                }
            }
            bVar.f13003m = new SegmentTree(bVar.f13002l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new jg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f12993a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j10 = ((jg.a) bVar2.d.get(i13)).f12987a[i14];
                        jArr2[i13] = jArr2[i13] + j10;
                        if (j10 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j3 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j3 < 0.01d && iArr[i15] > bVar2.f12993a.length / 2.0f) {
                        arrayList.add((jg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((jg.a) obj);
                }
            }
            int length3 = ((jg.a) bVar2.d.get(0)).f12987a.length;
            int size3 = bVar2.d.size();
            bVar2.f13004l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f13004l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f13004l;
                    jArr3[i17] = jArr3[i17] + ((jg.a) bVar2.d.get(i18)).f12987a[i17];
                }
            }
            new SegmentTree(bVar2.f13004l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static da1 d0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        da1 da1Var = new da1(str, i10);
        da1Var.f32915m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b c02 = c0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                da1Var.d = c02;
                if (c02 != null) {
                    c02.h = statsGraph.rate;
                }
                da1Var.f32910g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (c02 == null || (jArr2 = c02.f12993a) == null || jArr2.length < 2) {
                    da1Var.f32914l = true;
                }
                if (i10 == 4 && c02 != null && (jArr = c02.f12993a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    da1Var.e = new jg.e(c02, j3);
                    da1Var.f32908c = j3;
                    return da1Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            da1Var.f32909f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return da1Var;
    }

    public static void i0(da1 da1Var, ArrayList arrayList, org.telegram.ui.ActionBar.j6 j6Var) {
        jg.b bVar;
        int i10;
        if (da1Var != null && (bVar = da1Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                jg.a aVar = (jg.a) obj;
                int i12 = aVar.f12991g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.i6.c1(i12)) {
                        int i13 = aVar.f12991g;
                        if (org.telegram.ui.ActionBar.i6.I == org.telegram.ui.ActionBar.i6.J) {
                            i10 = aVar.f12992i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.i6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.i6.nl[aVar.f12991g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, aVar.f12991g));
                }
            }
        }
    }

    public static void j0(View view) {
        if (view instanceof ca1) {
            ((ca1) view).d();
        } else if (view instanceof org.telegram.ui.Cells.b7) {
            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false)), org.telegram.ui.ActionBar.i6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f19021b7), 0, 0);
            rqVar.f28069w = true;
            view.setBackground(rqVar);
        } else if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof la1) {
            int i10 = la1.d;
            ((la1) view).b();
        }
    }

    public final void a0() {
        int i10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.f37058c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        AndroidUtilities.setViewLayoutMargins(this.R.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(42.0f)) / 2) + this.mSystemInsets.f10580b, AndroidUtilities.dp(6.0f), 0);
        this.m0.setPadding(0, 0, 0, this.mSystemInsets.d);
        r91 r91Var = this.S;
        if (r91Var != null) {
            i0.b bVar = this.mSystemInsets;
            li.b.a(r91Var, bVar.f10580b, bVar.d, currentActionBarHeight, i10);
        }
        dc dcVar = this.f37066i0;
        if (dcVar != null) {
            org.telegram.ui.Components.yl0 yl0Var = dcVar.F;
            i0.b bVar2 = this.mSystemInsets;
            li.b.a(yl0Var, bVar2.f10580b, bVar2.d, currentActionBarHeight, i10);
        }
        me meVar = this.f37067j0;
        if (meVar != null) {
            de deVar = meVar.f35641a1;
            i0.b bVar3 = this.mSystemInsets;
            li.b.a(deVar, bVar3.f10580b, bVar3.d, currentActionBarHeight, i10);
        }
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        boolean z12;
        int i10;
        String str;
        ah.e eVar;
        boolean z13;
        ra1 ra1Var = this;
        ra1Var.Z = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(ra1Var.currentAccount);
        long j3 = ra1Var.f37056b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(ra1Var.currentAccount).getChatFull(j3);
        if (chatFull != null && chatFull.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, ra1Var.resourceProvider, oh.a.MONETIZATION, R.string.Monetization));
        }
        ra1Var.f37071n0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        dh0 dh0Var = new dh0(context, ra1Var.resourceProvider);
        ra1Var.f37069l0 = dh0Var;
        dh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        ra1Var.f37069l0.setMaxWidth(AndroidUtilities.dp(344.0f));
        ra1Var.f37069l0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        ra1Var.m0 = frameLayout2;
        frameLayout2.setOnClickListener(new ai.e2(20));
        ra1Var.m0.addView(ra1Var.f37069l0, w7.y5.e(-1, 72, 81));
        ra1Var.m0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = ra1Var.f37071n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ci.n4(ra1Var, i11, 25));
            ra1Var.f37069l0.addView(ra1Var.f37071n0[i11]);
            ra1Var.f37069l0.i(bVar, true, false);
            i11++;
        }
        ra1Var.f37065h0 = new ci.i1(ra1Var, ra1Var.getParentActivity(), 7);
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (isBoostSupported) {
            dc dcVar = new dc(ra1Var, -j3, ra1Var.getResourceProvider());
            ra1Var.f37066i0 = dcVar;
            dcVar.F.setCaptureSectionsDecoratorAllowed(true);
            ra1Var.glassEngine.b(ra1Var.f37066i0.F);
        }
        if (z11) {
            Activity parentActivity = ra1Var.getParentActivity();
            int i12 = ra1Var.currentAccount;
            long j10 = -j3;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.e6 resourceProvider = ra1Var.getResourceProvider();
            li.l lVar = ra1Var.glassEngine;
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            me meVar = new me(parentActivity, ra1Var, i12, j10, resourceProvider, lVar, z13, chatFull.can_view_stars_revenue);
            ra1Var = ra1Var;
            ra1Var.f37067j0 = meVar;
            meVar.f35641a1.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
        }
        boolean z14 = z10;
        FrameLayout frameLayout4 = frameLayout;
        ra1Var.f37065h0.setAdapter(new q91(ra1Var, z14, isBoostSupported, z11, frameLayout4));
        boolean z15 = ra1Var.f37068k0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        ra1Var.f37058c = z12;
        if (z12 && ra1Var.f37059c0) {
            ra1Var.f37065h0.setPosition(z14 ? 1 : 0);
        } else if (z12 && ra1Var.f37060d0) {
            ci.i1 i1Var = ra1Var.f37065h0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i1Var.setPosition(i10 + (z14 ? 1 : 0));
        }
        ra1Var.k0(ra1Var.f37065h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(ra1Var.getParentActivity());
        frameLayout5.setBackgroundColor(ra1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7));
        frameLayout5.addView(ra1Var.f37065h0, w7.y5.g());
        frameLayout5.addView(ra1Var.actionBar);
        if (ra1Var.f37058c) {
            ra1Var.setBulletinDelegate(new ci.z8(12));
            FrameLayout frameLayout6 = ra1Var.m0;
            li.b baseSimpleGlass = ra1Var.getBaseSimpleGlass();
            FrameLayout frameLayout7 = ra1Var.m0;
            ah.c cVar = baseSimpleGlass.d;
            if (baseSimpleGlass.f14357f == org.telegram.ui.ActionBar.k.f19517c) {
                ah.e eVar2 = new ah.e(baseSimpleGlass.e.c(frameLayout7, null, false));
                eVar2.b(AndroidUtilities.dp(60.0f), false);
                ah.e eVar3 = new ah.e(cVar.c(frameLayout7, null, false));
                eVar3.b(AndroidUtilities.dp(60.0f), false);
                eVar3.f443q = 180;
                es esVar = new es(eVar2, eVar3);
                esVar.b(true, false);
                esVar.f33312g = true;
                eVar = esVar;
            } else {
                ah.e eVar4 = new ah.e(cVar.c(frameLayout7, null, false));
                eVar4.b(AndroidUtilities.dp(60.0f), true);
                eVar = eVar4;
            }
            frameLayout6.setBackground(eVar);
            frameLayout5.addView(ra1Var.m0, w7.y5.e(-1, -2, 80));
        }
        ra1Var.fragmentView = frameLayout5;
        r91 r91Var = new r91(ra1Var, context);
        ra1Var.S = r91Var;
        r91Var.setCaptureSectionsDecoratorAllowed(true);
        ra1Var.S.setSections(true);
        ra1Var.S.setClipToPadding(false);
        ra1Var.glassEngine.b(ra1Var.S);
        ra1Var.S.q1();
        LinearLayout linearLayout = new LinearLayout(context);
        ra1Var.f37055a0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        ra1Var.V = imageView;
        imageView.setAutoRepeat(true);
        ra1Var.V.f(R.raw.statistic_preload, 120, 120, null);
        ra1Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.qk.l(R.string.LoadingStatsDescription, textView2, 1);
        ra1Var.f37055a0.addView(ra1Var.V, w7.y5.t(120, 120, 1, 0, 0, 0, 20));
        ra1Var.f37055a0.addView(textView, w7.y5.t(-2, -2, 1, 0, 0, 0, 10));
        ra1Var.f37055a0.addView(textView2, w7.y5.q(-2, -2, 1));
        frameLayout4.addView(ra1Var.f37055a0, w7.y5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (ra1Var.W == null) {
            ra1Var.W = new w91(ra1Var);
        }
        ra1Var.S.setAdapter(ra1Var.W);
        s4.c0 c0Var = new s4.c0();
        ra1Var.T = c0Var;
        ra1Var.S.setLayoutManager(c0Var);
        ra1Var.X = new s4.j();
        ra1Var.S.setItemAnimator(null);
        ra1Var.S.j(new j3(ra1Var, 29));
        ra1Var.S.setOnItemClickListener(new t21(ra1Var, 7));
        ra1Var.S.setOnItemLongClickListener(new qk0(ra1Var, 21));
        frameLayout4.addView(ra1Var.S);
        ra1Var.R = new org.telegram.ui.Components.go(context, null, false, null);
        TLRPC.Chat chat2 = ra1Var.getMessagesController().getChat(Long.valueOf(j3));
        ra1Var.R.setChatAvatar(chat2);
        hg.k0.v(false, ra1Var.actionBar);
        org.telegram.ui.ActionBar.l lVar2 = ra1Var.actionBar;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        lVar2.setTitle(str);
        ra1Var.actionBar.setActionBarMenuOnItemClick(new h81(ra1Var, 2));
        ra1Var.R.i(org.telegram.ui.ActionBar.i6.w0(null, i13, false), org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        ra1Var.actionBar.E(org.telegram.ui.ActionBar.i6.w0(null, i13, false), false);
        ra1Var.actionBar.E(org.telegram.ui.ActionBar.i6.w0(null, i13, false), true);
        ra1Var.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19463z8, false), false);
        boolean z16 = ra1Var.f37085x0;
        y5 y5Var = ra1Var.B0;
        if (z16) {
            ra1Var.f37055a0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(y5Var, 500L);
            ra1Var.f37055a0.setVisibility(0);
            ra1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            ra1Var.f37055a0.setVisibility(8);
            ra1Var.S.setVisibility(0);
        }
        ch.d c10 = ra1Var.getBaseSimpleGlass().f14356c.c(ra1Var.f37069l0, eh.b.f(ra1Var.resourceProvider), false);
        c10.w(AndroidUtilities.dp(28.0f));
        c10.v(AndroidUtilities.dp(7.666f));
        ra1Var.f37069l0.setBackground(c10);
        ra1Var.glassEngine.c(ra1Var.f37065h0);
        ra1Var.getBaseSimpleGlass().c(frameLayout5, ra1Var.f37065h0, ra1Var.actionBar, ra1Var.resourceProvider);
        ra1Var.getBaseSimpleGlass().f14361k = new li.a(4, ra1Var, frameLayout5);
        ra1Var.getBaseSimpleGlass().f14360j = null;
        AndroidUtilities.removeFromParent(ra1Var.R.e);
        frameLayout5.addView(ra1Var.R.e, w7.y5.e(42, 42, 53));
        ra1Var.a0();
        ra1Var.f37087y0 = new ea1(ra1Var.W, ra1Var.T);
        return ra1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        org.telegram.ui.ActionBar.o2 o2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.d9) objArr[0]) == this.f37088z0) {
                h0();
                m0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.f37087y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    o2Var = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.c1.i(2, fragmentStack);
                } else {
                    o2Var = null;
                }
                if (o2Var instanceof so) {
                    ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    o2Var2 = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.c1.i(2, fragmentStack2);
                } else {
                    o2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        o2Var3 = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.c1.i(3, fragmentStack2);
                    }
                    if (o2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
                    }
                    finishFragment();
                    if (o2Var3 instanceof xn) {
                        tg.i.f(o2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    tg.i.f(o2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f37076r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f37073p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((oa1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((oa1) arrayList.get(i14));
                        } else {
                            ((oa1) arrayList.get(i14)).f36173b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f37078s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    oa1 oa1Var = (oa1) arrayList.get(i12);
                    if (oa1Var.f36173b == null) {
                        this.f37072o0 = oa1Var.b();
                        break;
                    } else {
                        arrayList4.add(oa1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    f0();
                }
                m0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.f37087y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18330id == this.f37056b && this.f37054a == null) {
                this.f37054a = chatFull;
                g0();
            }
        }
    }

    public final void e0(da1[] da1VarArr) {
        w91 w91Var = this.W;
        if (w91Var != null) {
            w91Var.E();
            this.S.setItemAnimator(null);
            this.W.l();
        }
        this.f37085x0 = false;
        LinearLayout linearLayout = this.f37055a0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f37055a0.animate().alpha(0.0f).setDuration(230L).setListener(new ap0(this, 22));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (da1 da1Var : da1VarArr) {
                if (da1Var != null && da1Var.d == null && da1Var.f32909f != null) {
                    da1Var.a(this.currentAccount, this.classGuid, this.f37054a.stats_dc, new org.telegram.ui.Components.h61(1, this, da1Var));
                }
            }
        }
    }

    public final void f0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f18367id = new ArrayList<>();
        ArrayList arrayList = this.f37076r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f37073p0.get(this.f37072o0); i11 < size; i11++) {
            if (((oa1) arrayList.get(i11)).f36173b == null) {
                tL_channels_getMessages.f18367id.add(Integer.valueOf(((oa1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f37056b);
        this.f37083w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new p91(this, 0));
    }

    public final void g0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f37068k0) {
            return;
        }
        boolean z10 = this.f37057b0;
        long j3 = this.f37056b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new p91(this, 1), null, null, 0, this.f37054a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        da1 da1Var;
        da1 da1Var2;
        qy0 qy0Var = new qy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f19001a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.f19164j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19128h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19461z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19463z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.f19021b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.f19425x6));
        int i13 = org.telegram.ui.ActionBar.i6.f19278p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19222m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19372u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19390v6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f37057b0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    da1Var2 = this.d;
                } else if (i14 == 1) {
                    da1Var2 = this.H;
                } else if (i14 == 2) {
                    da1Var2 = this.I;
                } else if (i14 == 3) {
                    da1Var2 = this.J;
                } else if (i14 == 4) {
                    da1Var2 = this.K;
                } else {
                    da1Var2 = this.L;
                }
                i0(da1Var2, arrayList, qy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    da1Var = this.d;
                } else if (i15 == 1) {
                    da1Var = this.h;
                } else if (i15 == 2) {
                    da1Var = this.f37070n;
                } else if (i15 == 3) {
                    da1Var = this.f37075r;
                } else if (i15 == 4) {
                    da1Var = this.f37077s;
                } else if (i15 == 5) {
                    da1Var = this.v;
                } else if (i15 == 6) {
                    da1Var = this.f37084x;
                } else if (i15 == 7) {
                    da1Var = this.e;
                } else if (i15 == 8) {
                    da1Var = this.f37082w;
                } else if (i15 == 9) {
                    da1Var = this.f37086y;
                } else if (i15 == 10) {
                    da1Var = this.E;
                } else {
                    da1Var = this.F;
                }
                i0(da1Var, arrayList, qy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        ArrayList arrayList = this.f37080u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f37079t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            oa1 oa1Var = (oa1) obj;
            MessageObject f7 = this.f37088z0.f(oa1Var.b());
            if (f7 != null) {
                oa1Var.f36173b = f7;
                arrayList.add(oa1Var);
            }
        }
        this.f37074q0.clear();
        arrayList2.clear();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false)) <= 0.699999988079071d) {
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
        ci.i1 i1Var = this.f37065h0;
        if (i1Var != null && (i1Var.f30620b != 0 || i1Var.f30621c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void k0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f37071n0;
            if (i11 < bVarArr.length) {
                oh.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void l0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.f37071n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            oh.b bVar = this.f37071n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.f37069l0.invalidate();
    }

    public final void m0() {
        ArrayList arrayList = this.f37081v0;
        arrayList.clear();
        arrayList.addAll(this.f37078s0);
        arrayList.addAll(this.f37080u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.C0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.C0 = null;
        }
        this.C0 = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.messagesDidLoad).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.boostByChannelCreated).add(NotificationCenter.storiesListUpdated);
        ai.l9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.f37056b;
        ai.d9 A = storiesController.A(-j3, 2, -1, true);
        this.f37088z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f37054a != null) {
            g0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j3, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.C0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.C0 = null;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.f37064g0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        ai.d9 d9Var = this.f37088z0;
        if (d9Var != null) {
            d9Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        a0();
    }
}
