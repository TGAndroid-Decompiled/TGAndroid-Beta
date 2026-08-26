package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda10;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.Components.UItem;

public final class AddressBarList$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener, Utilities.Callback5 {
    public final AddressBarList f$0;

    public AddressBarList$$ExternalSyntheticLambda2(AddressBarList addressBarList) {
        this.f$0 = addressBarList;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        AddressBarList addressBarList = this.f$0;
        addressBarList.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        addressBarList.listView.adapter.update(true);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10;
        UItem uItem = (UItem) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        AddressBarList addressBarList = this.f$0;
        addressBarList.getClass();
        if (uItem.instanceOf(AddressBarList.Address2View.Factory.class)) {
            String string = uItem.text.toString();
            ArticleViewer$$ExternalSyntheticLambda33 articleViewer$$ExternalSyntheticLambda33 = addressBarList.onQueryClick;
            if (articleViewer$$ExternalSyntheticLambda33 != null) {
                articleViewer$$ExternalSyntheticLambda33.run(string);
                return;
            }
            return;
        }
        if (!uItem.instanceOf(AddressBarList.BookmarkView.Factory.class) || (articleViewer$$ExternalSyntheticLambda10 = addressBarList.onURLClick) == null) {
            return;
        }
        try {
            articleViewer$$ExternalSyntheticLambda10.run(AddressBarList.getLink((MessageObject) uItem.object2));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
