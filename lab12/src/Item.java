import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Item<T> {
    private T first;
    private T second;
    private final UUID id;
}
