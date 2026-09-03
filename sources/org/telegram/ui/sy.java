package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class sy extends org.telegram.ui.ActionBar.j {
    public final yy f41330a;

    public sy(yy yyVar) {
        this.f41330a = yyVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        yy yyVar = this.f41330a;
        int i12 = yyVar.f43737w;
        ArrayList arrayList = yyVar.f43732e;
        int i13 = yyVar.f43738x;
        if (i10 == -1) {
            if (yyVar.f43739y == null) {
                yyVar.Y();
            } else {
                yyVar.finishFragment();
            }
        } else if (i10 == 1 && yyVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            yyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = yyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.p2) yyVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(yyVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(yyVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(yyVar.getParentActivity(), appWidgetManager, i13);
            }
            a1 a1Var = yyVar.f43739y;
            if (a1Var != null) {
                int i15 = a1Var.f34975a;
                Object obj = a1Var.f34976b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.C;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.B);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.C;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.B);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            yyVar.Y();
        }
    }
}
