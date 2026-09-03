package tf;

import org.telegram.messenger.R;
public enum w {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f44934a;
    public final int f44935b;
    public final int f44936c;

    w(int i10, int i11, int i12) {
        this.f44934a = i10;
        this.f44935b = i11;
        this.f44936c = i12;
    }
}
