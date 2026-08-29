package rf;

import org.telegram.messenger.R;
public enum x {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f47399a;
    public final int f47400b;
    public final int f47401c;

    x(int i10, int i11, int i12) {
        this.f47399a = i10;
        this.f47400b = i11;
        this.f47401c = i12;
    }
}
